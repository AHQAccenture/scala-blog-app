# Initial blog schema

# --- !Ups
CREATE TABLE blog_posts (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    author VARCHAR(100) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP
);

INSERT INTO blog_posts (title, content, author, created_at) VALUES 
('Welcome to My Blog', 'This is my first blog post using Scala and Play Framework!', 'Admin', CURRENT_TIMESTAMP()),
('Learning Scala', 'Scala is a powerful functional programming language that runs on the JVM.', 'Admin', CURRENT_TIMESTAMP());

# --- !Downs
DROP TABLE blog_posts;