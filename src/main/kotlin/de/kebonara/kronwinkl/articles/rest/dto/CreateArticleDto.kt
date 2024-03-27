package de.kebonara.kronwinkl.articles.rest.dto

data class CreateArticleDto(
    val typ: String,
    val date: String,
    val title: String,
    val html: String,
    val dokumente: List<CreateDokumentDto>?,
    val imgMeta: List<CreateImgMetaDto>?
)
