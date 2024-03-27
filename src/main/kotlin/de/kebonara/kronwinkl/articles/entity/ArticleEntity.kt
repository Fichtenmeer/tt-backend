package de.kebonara.kronwinkl.articles.entity

import de.kebonara.kronwinkl.articles.model.ArticleType
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import java.time.LocalDate
import java.util.*

@Entity(name = "article")
class ArticleEntity(
    @Id
    var id: UUID,
    var title: String,
    var date: LocalDate,
    var html: String,
    @Enumerated(EnumType.STRING)
    var typ: ArticleType
) {
}
