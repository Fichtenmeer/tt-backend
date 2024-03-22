package de.kebonara.kronwinkl.articles.controller

import de.kebonara.kronwinkl.articles.dto.ArticleDto
import de.kebonara.kronwinkl.articles.dto.DokumentDto
import de.kebonara.kronwinkl.articles.dto.ImgMetaDto
import de.kebonara.kronwinkl.articles.mapper.toDto
import de.kebonara.kronwinkl.articles.repository.ArticleRepository
import de.kebonara.kronwinkl.articles.repository.DokumentRepository
import de.kebonara.kronwinkl.articles.repository.ImgRepository
import de.kebonara.kronwinkl.config.BlobStorageConfig
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller
import java.util.*

@Controller
class ArticleController(
    val articleRepository: ArticleRepository,
    val imgRepository: ImgRepository,
    val dokumentRepository: DokumentRepository,
    val blobStorageConfig: BlobStorageConfig
) {
    @QueryMapping
    fun articles(): List<ArticleDto> = articleRepository.findAll().map { it.toDto() }

    @SchemaMapping(field = "images", typeName = "Article")
    fun images(article: ArticleDto): List<ImgMetaDto> =
        imgRepository.findAllByArticleId(UUID.fromString(article.id)).map { it.toDto(blobStorageConfig.baseUrl,
            blobStorageConfig.images) }

    @SchemaMapping(field = "dokuments", typeName = "Article")
    fun dokuments(article: ArticleDto): List<DokumentDto> =
        dokumentRepository.findAllByArticleId(UUID.fromString(article.id)).map { it.toDto(blobStorageConfig.baseUrl,
            blobStorageConfig.dokuments) }
}
