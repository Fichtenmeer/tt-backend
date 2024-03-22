package de.kebonara.kronwinkl.articles.dto

data class ArticleDto(
    var id: String,
    var typ: String,
    var date: String,
    var title: String,
    var html: String
)
