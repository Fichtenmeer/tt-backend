package de.kebonara.kronwinkl.articles.repository

import de.kebonara.kronwinkl.articles.entity.Dokument
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface DokumentRepository : JpaRepository<Dokument, UUID> {
    fun findAllByArticleId(articleId: UUID): List<Dokument>
}
