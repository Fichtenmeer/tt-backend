package de.kebonara.kronwinkl.articles.model

import java.time.LocalDate
import java.util.UUID

data class Article(
    var id: UUID,
    var typ: ArticleType,
    var date: LocalDate,
    var title: String,
    var html: String
)
