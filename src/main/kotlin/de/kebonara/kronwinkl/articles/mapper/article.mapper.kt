package de.kebonara.kronwinkl.articles.mapper

import de.kebonara.kronwinkl.articles.dto.ArticleDto
import de.kebonara.kronwinkl.articles.dto.DokumentDto
import de.kebonara.kronwinkl.articles.dto.ImgMetaDto
import de.kebonara.kronwinkl.articles.entity.Article
import de.kebonara.kronwinkl.articles.entity.Dokument
import de.kebonara.kronwinkl.articles.entity.ImgMeta

fun Article.toDto(): ArticleDto = ArticleDto(
    id = id.toString(),
    typ = typ.toString(),
    date = date.toString(),
    title = title,
    html = html
)

fun ImgMeta.toDto(): ImgMetaDto = ImgMetaDto(
    id = id.toString(),
    url = filename,
    alt = alt
)

fun Dokument.toDto(): DokumentDto = DokumentDto(
    id = id.toString(),
    title = title,
    url = filename
)
