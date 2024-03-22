package de.kebonara.kronwinkl.articles.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
class Dokument(
    @Id
    var id: UUID,
    var filename: String,
    var title: String,
    var articleId: UUID
) {
}