package de.kebonara.kronwinkl.articles.repository

import de.kebonara.kronwinkl.articles.entity.ImgMeta
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ImgRepository : JpaRepository<ImgMeta, UUID> {
    fun findAllByArticleId(articleId: UUID): List<ImgMeta>
}
