package de.kebonara.kronwinkl.articles.dto

data class CreateArticleDto(
    var typ: String,
    var date: String,
    var title: String,
    var html: String,
    var dokumente: List<CreateDokumentDto>,
    var imgMeta: List<CreateImgMetaDto>
)
