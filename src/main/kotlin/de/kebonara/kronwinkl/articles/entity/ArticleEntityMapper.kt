package de.kebonara.kronwinkl.articles.entity

import de.kebonara.kronwinkl.articles.model.Article

fun ArticleEntity.toModel() = Article(
    id = id,
    typ = typ,
    date = date,
    title = title,
    html = html
)
