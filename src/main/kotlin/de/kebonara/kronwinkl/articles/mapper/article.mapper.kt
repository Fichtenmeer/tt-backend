package de.kebonara.kronwinkl.articles.mapper

import de.kebonara.kronwinkl.articles.dto.*
import de.kebonara.kronwinkl.articles.entity.Article
import de.kebonara.kronwinkl.articles.entity.ArticleType
import de.kebonara.kronwinkl.articles.entity.Dokument
import de.kebonara.kronwinkl.articles.entity.ImgMeta
import java.time.LocalDate
import java.util.UUID

fun Article.toDto(): ArticleDto = ArticleDto(
    id = id.toString(),
    typ = typ.toString(),
    date = date.toString(),
    title = title,
    html = html
)

fun ImgMeta.toDto(): ImgMetaDto = ImgMetaDto(
    id = id.toString(),
    url = name,
    name = name,
    alt = alt
)

fun Dokument.toDto(): DokumentDto = DokumentDto(
    id = id.toString(),
    name = title,
    url = name
)

fun CreateArticleDto.toEntity(): Article = Article(
    id = UUID.randomUUID(),
    typ = ArticleType.valueOf(typ),
    date = LocalDate.parse(date),
    title = title,
    html = html
)

fun CreateImgMetaDto.toEntity(articleId: UUID): ImgMeta = ImgMeta(
    id = UUID.randomUUID(),
    name = name,
    alt = alt,
    articleId = articleId
)

fun CreateDokumentDto.toEntity(articleId: UUID): Dokument = Dokument(
    id = UUID.randomUUID(),
    name = name,
    title = title,
    articleId = articleId
)
