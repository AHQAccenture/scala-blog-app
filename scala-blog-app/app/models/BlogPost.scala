package models

import java.time.LocalDateTime

case class BlogPost(
    id: Option[Long] = None,
    title: String,
    content: String,
    author: String,
    createdAt: LocalDateTime = LocalDateTime.now(),
    updatedAt: Option[LocalDateTime] = None
)