package de.kebonara.kronwinkl.articles.controller

import de.kebonara.kronwinkl.articles.dto.ArticleDto
import de.kebonara.kronwinkl.articles.dto.CreateArticleDto
import de.kebonara.kronwinkl.articles.repository.ArticleRepository
import de.kebonara.kronwinkl.articles.repository.DokumentRepository
import de.kebonara.kronwinkl.articles.repository.ImgRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/articles")
@RestController
class CreateArticleController(
    val articleRepository: ArticleRepository,
    val dokumentRepository: DokumentRepository,
    val imgRepository: ImgRepository
) {
    @PostMapping
    fun createArticle(article: CreateArticleDto) {
        // TODO
    }
}