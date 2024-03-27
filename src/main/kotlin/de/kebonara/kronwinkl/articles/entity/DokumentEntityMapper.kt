package de.kebonara.kronwinkl.articles.entity

import de.kebonara.kronwinkl.articles.model.Dokument

fun DokumentEntity.toModel(baseUrl: String, folder: String): Dokument =
    Dokument(
        id = id,
        title = title,
        name = name,
        url = "$baseUrl/$folder/$name"
    )
