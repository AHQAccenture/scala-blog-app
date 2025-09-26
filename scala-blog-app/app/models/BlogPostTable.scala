package models

import slick.jdbc.H2Profile.api._
import java.time.LocalDateTime

class BlogPostTable(tag: Tag) extends Table[BlogPost](tag, "blog_posts") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def title = column[String]("title")
  def content = column[String]("content", O.Length(10000))
  def author = column[String]("author")
  def createdAt = column[LocalDateTime]("created_at")
  def updatedAt = column[Option[LocalDateTime]]("updated_at")

  def * = (id.?, title, content, author, createdAt, updatedAt) <> (BlogPost.tupled, BlogPost.unapply)
}

object BlogPostTable {
  val blogPosts = TableQuery[BlogPostTable]
}