package de.kebonara.kronwinkl.articles.service

import de.kebonara.kronwinkl.articles.entity.DokumentEntity
import de.kebonara.kronwinkl.articles.entity.toModel
import de.kebonara.kronwinkl.articles.model.Article
import de.kebonara.kronwinkl.articles.model.Dokument
import de.kebonara.kronwinkl.articles.repository.DokumentRepository
import de.kebonara.kronwinkl.articles.rest.dto.CreateDokumentDto
import de.kebonara.kronwinkl.config.BlobStorageConfig
import org.springframework.stereotype.Service
import java.util.*

@Service
class DokumentService(
    val dokumentRepository: DokumentRepository,
    val blobStorageConfig: BlobStorageConfig
) {
    fun createDokument(dokumente: List<CreateDokumentDto>, articleId: UUID): List<Dokument> =
        dokumentRepository.saveAll(
            dokumente.map { it.toEntity(articleId) }
        ).map { it.toModel(blobStorageConfig.baseUrl, blobStorageConfig.dokuments) }

    fun getDokuments(articles: List<Article>): Map<UUID, List<Dokument>> =
        dokumentRepository.findAllByArticleIdIn(articles.map { it.id })
            .groupBy({ it.articleId }, { it.toModel(blobStorageConfig.baseUrl, blobStorageConfig.dokuments) })

    private fun CreateDokumentDto.toEntity(articleId: UUID): DokumentEntity = DokumentEntity(
        id = UUID.randomUUID(),
        name = name,
        title = title,
        articleId = articleId
    )
}