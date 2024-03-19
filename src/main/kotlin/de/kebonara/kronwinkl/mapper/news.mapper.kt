package de.kebonara.kronwinkl.mapper

import de.kebonara.kronwinkl.dto.NewsDto
import de.kebonara.kronwinkl.entity.News

fun News.toDto(): NewsDto = NewsDto(
    id = id.toString(),
    typ = typ.toString(),
    date = date.toString(),
    title = title,
    html = html,
    images = listOf(),
    dokuments = listOf()
)
