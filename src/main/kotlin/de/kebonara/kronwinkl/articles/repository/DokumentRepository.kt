package de.kebonara.kronwinkl.articles.repository

import de.kebonara.kronwinkl.articles.entity.DokumentEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface DokumentRepository : JpaRepository<DokumentEntity, UUID> {
    fun findAllByArticleIdIn(articleIds: List<UUID>): List<DokumentEntity>
}
