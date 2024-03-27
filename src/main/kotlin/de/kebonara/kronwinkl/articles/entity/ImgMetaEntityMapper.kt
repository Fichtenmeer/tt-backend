package de.kebonara.kronwinkl.articles.entity

import de.kebonara.kronwinkl.articles.model.ImgMeta

fun ImgMetaEntity.toModel(baseUrl: String, folder: String) = ImgMeta(
    id = id.toString(),
    name = name,
    alt = alt,
    url = "$baseUrl/$folder/$name"
)