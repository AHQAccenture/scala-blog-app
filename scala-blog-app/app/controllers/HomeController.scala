package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import scala.concurrent.{ExecutionContext, Future}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents , dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */

  private val dbConfig = dbConfigProvider.get[JdbcProfile]
  import dbConfig._
  import profile.api._ 

  def index() = Action.async { implicit request: Request[AnyContent] =>
    // Simple raw SQL query to test database
    val query = sql"SELECT COUNT(*) as count FROM blog_posts".as[Int].head
    
    db.run(query).map { count =>
      Ok(s"Database is working! Found $count blog posts. Visit /blog to see them.")
    }.recover {
      case ex => 
        Ok(s"Database error: ${ex.getMessage}")
    }
  }

  // New endpoint to show blog posts
  def blog() = Action.async { implicit request =>
    val query = sql"""
      SELECT id, title, content, author, created_at 
      FROM blog_posts 
      ORDER BY created_at DESC
    """.as[(Long, String, String, String, java.sql.Timestamp)]
    
    db.run(query).map { posts =>
      val html = posts.map { case (id, title, content, author, createdAt) =>
        s"""
        <article style="margin-bottom: 2em; padding: 1em; border: 1px solid #ddd;">
          <h2>$title</h2>
          <p>$content</p>
          <small>By $author on $createdAt</small>
        </article>
        """
      }.mkString
      
      Ok(s"""
        <html>
          <head><title>My Blog</title></head>
          <body>
            <h1>My Blog Posts</h1>
            $html
            <a href="/">← Back to Home</a>
          </body>
        </html>
      """).as("text/html")
    }.recover {
      case ex => 
        InternalServerError(s"Error loading blog posts: ${ex.getMessage}")
    }
  }
}
