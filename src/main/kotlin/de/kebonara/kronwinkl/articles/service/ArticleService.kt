package de.kebonara.kronwinkl.articles.service

import de.kebonara.kronwinkl.articles.entity.ArticleEntity
import de.kebonara.kronwinkl.articles.entity.toModel
import de.kebonara.kronwinkl.articles.model.Article
import de.kebonara.kronwinkl.articles.model.ArticleType
import de.kebonara.kronwinkl.articles.repository.ArticleRepository
import de.kebonara.kronwinkl.articles.rest.dto.CreateArticleDto
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.util.*

@Service
class ArticleService(
    val articleRepository: ArticleRepository
) {
    fun createArticle(article: CreateArticleDto): Article = articleRepository.save(article.toEntity()).toModel()

    fun getArticles(): List<Article> = articleRepository.findAll().map { it.toModel() }

    private fun CreateArticleDto.toEntity(): ArticleEntity = ArticleEntity(
        id = UUID.randomUUID(),
        typ = ArticleType.valueOf(typ.uppercase()),
        date = LocalDate.parse(date),
        title = title,
        html = html
    )
}