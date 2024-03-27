package de.kebonara.kronwinkl.articles.repository

import de.kebonara.kronwinkl.articles.entity.ArticleEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ArticleRepository : JpaRepository<ArticleEntity, UUID> {
}
