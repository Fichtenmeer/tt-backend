package de.kebonara.kronwinkl.dto

data class NewsDto(
    val id: String,
    val typ: String,
    val date: String,
    val title: String,
    val html: String,
    val images: List<ImgMetaDto>,
    val dokuments: List<DokumentDto>
)
