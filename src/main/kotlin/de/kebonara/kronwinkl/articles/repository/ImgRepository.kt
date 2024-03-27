package de.kebonara.kronwinkl.articles.repository

import de.kebonara.kronwinkl.articles.entity.ImgMetaEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ImgRepository : JpaRepository<ImgMetaEntity, UUID> {
    fun findAllByArticleIdIn(articleIds: List<UUID>): List<ImgMetaEntity>
}
