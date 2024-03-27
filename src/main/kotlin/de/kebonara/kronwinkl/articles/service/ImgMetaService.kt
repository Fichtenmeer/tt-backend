package de.kebonara.kronwinkl.articles.service

import de.kebonara.kronwinkl.articles.entity.ImgMetaEntity
import de.kebonara.kronwinkl.articles.entity.toModel
import de.kebonara.kronwinkl.articles.model.Article
import de.kebonara.kronwinkl.articles.model.ImgMeta
import de.kebonara.kronwinkl.articles.repository.ImgRepository
import de.kebonara.kronwinkl.articles.rest.dto.CreateImgMetaDto
import de.kebonara.kronwinkl.config.BlobStorageConfig
import org.springframework.stereotype.Service
import java.util.*

@Service
class ImgMetaService(
    val imgRepository: ImgRepository,
    val blobStorageConfig: BlobStorageConfig
) {
    fun createImgMeta(imgMetas: List<CreateImgMetaDto>, articleId: UUID): List<ImgMeta> = imgRepository
        .saveAll(imgMetas.map { it.toEntity(articleId) })
        .map { it.toModel(blobStorageConfig.baseUrl, blobStorageConfig.images) }

    fun getImgMetas(articles: List<Article>): Map<UUID, List<ImgMeta>> = imgRepository
        .findAllByArticleIdIn(articles.map { it.id })
        .groupBy({ it.articleId }, { it.toModel(blobStorageConfig.baseUrl, blobStorageConfig.images) })

    private fun CreateImgMetaDto.toEntity(articleId: UUID): ImgMetaEntity = ImgMetaEntity(
        id = UUID.randomUUID(),
        name = name,
        alt = alt,
        articleId = articleId
    )
}