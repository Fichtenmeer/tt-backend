package de.kebonara.kronwinkl.controller

import de.kebonara.kronwinkl.dto.NewsDto
import de.kebonara.kronwinkl.mapper.toDto
import de.kebonara.kronwinkl.repository.NewsRepository
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class NewsController(
    val newsRepository: NewsRepository
) {
    @QueryMapping
    fun news(): List<NewsDto> {
        return newsRepository.findAll().map { it.toDto() }
    }
}
