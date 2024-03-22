package de.kebonara.kronwinkl.articles.repository

import de.kebonara.kronwinkl.articles.entity.Article
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ArticleRepository : JpaRepository<Article, UUID> {
}
