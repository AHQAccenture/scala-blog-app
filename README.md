# 📝 Scala Blog Application

A full-stack blog application built with Scala and Play Framework, demonstrating modern functional programming principles and reactive web development.

## 🎯 Project Overview

This project serves as a comprehensive learning exercise in Scala web development, covering everything from database design to frontend templating. The blog application will support multiple authors, rich content management, and a clean, responsive user interface.

## 🛠️ Technologies Used

### Backend
- **[Scala](https://scala-lang.org/)** - Functional programming language running on JVM
- **[Play Framework 3.0](https://www.playframework.com/)** - Reactive web application framework
- **[Slick](https://scala-slick.org/)** - Functional Relational Mapping (FRM) for database operations
- **[H2 Database](https://www.h2database.com/)** - In-memory database for development
- **[SBT](https://www.scala-sbt.org/)** - Scala Build Tool for dependency management

### Frontend
- **[Twirl Templates](https://github.com/playframework/twirl)** - Type-safe template engine
- **HTML5 & CSS3** - Modern web standards
- **Bootstrap** *(planned)* - Responsive UI framework

### Development Tools
- **Git & GitHub** - Version control and collaboration
- **VS Code + Metals** - IDE with Scala language server
- **ScalaTest** - Testing framework
- **Play Evolutions** - Database migration management

## ✨ Features

### Phase 1: Core Functionality ✅
- [x] Project setup with Play Framework
- [x] H2 database configuration
- [x] Basic blog post model
- [x] Database connectivity testing
- [ ] CRUD operations for blog posts
- [ ] RESTful API endpoints

### Phase 2: User Interface 🔄
- [ ] Blog post listing page
- [ ] Individual blog post view
- [ ] Create/Edit blog post forms
- [ ] Responsive design with Bootstrap
- [ ] Basic styling and layout

### Phase 3: Advanced Features 📋
- [ ] User authentication and authorization
- [ ] Comment system
- [ ] Categories and tagging
- [ ] Search functionality
- [ ] Markdown support for posts
- [ ] Image upload capability

### Phase 4: Production Ready 🚀
- [ ] PostgreSQL integration
- [ ] Comprehensive testing suite
- [ ] Performance optimization
- [ ] Docker containerization
- [ ] CI/CD pipeline setup

## 🗂️ Project Structure

```
scala-blog-app/
├── app/
│   ├── controllers/     # HTTP request handlers
│   ├── models/         # Data models and business logic
│   ├── views/          # Twirl templates
│   └── services/       # Business service layer
├── conf/
│   ├── application.conf # Application configuration
│   ├── routes          # URL routing definitions
│   └── evolutions/     # Database migrations
├── public/             # Static assets (CSS, JS, images)
├── test/              # Test suite
└── build.sbt          # Build configuration
```

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- SBT (Scala Build Tool)
- Git

### Installation
1. **Clone the repository**
   ```bash
   git clone https://github.com/ahqaccenture/scala-blog-app.git
   cd scala-blog-app
   ```

2. **Install dependencies**
   ```bash
   sbt compile
   ```

3. **Run the application**
   ```bash
   sbt run
   ```

4. **Visit the application**
   - Homepage: http://localhost:9000
   - Blog posts: http://localhost:9000/blog

## 📅 Development Timeline

| Phase | Duration | Status | Features |
|-------|----------|--------|----------|
| **Setup & Database** | Week 1 | ✅ Complete | Project setup, H2 integration, basic models |
| **CRUD Operations** | Week 2 | 🔄 In Progress | Repository pattern, service layer, API endpoints |
| **Frontend Views** | Week 3 | 📋 Planned | Templates, forms, responsive design |
| **Advanced Features** | Week 4-5 | 📋 Planned | Authentication, comments, search |
| **Production Polish** | Week 6 | 📋 Planned | Testing, optimization, deployment |

## 🧪 Running Tests

```bash
# Run all tests
sbt test

# Run specific test
sbt "testOnly controllers.HomeControllerSpec"

# Run tests with coverage
sbt coverage test coverageReport
```

## 📚 Learning Objectives

Through this project, I'm gaining experience with:

- **Functional Programming** - Immutable data structures, higher-order functions
- **Reactive Architecture** - Non-blocking I/O, asynchronous programming
- **Type Safety** - Compile-time error detection, type-safe database queries
- **Modern Web Development** - RESTful APIs, responsive design, testing strategies
- **Scala Ecosystem** - SBT, Slick, Play Framework best practices

## 🤝 Contributing

This is a personal learning project, but feedback and suggestions are welcome! Please feel free to:

- Open issues for bugs or feature suggestions
- Submit pull requests for improvements
- Share learning resources or tips

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Play Framework documentation and community
- Scala community for excellent learning resources
- Various blog posts and tutorials that guided this implementation

---

**Current Status**: Phase 1 complete, working on CRUD operations and repository pattern implementation.

*Last updated: September 2025*
