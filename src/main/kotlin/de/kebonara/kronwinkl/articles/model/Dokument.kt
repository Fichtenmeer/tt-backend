package de.kebonara.kronwinkl.articles.model

import java.util.*

data class Dokument(
    var id: UUID,
    var title: String,
    var name: String,
    var url: String?
)
