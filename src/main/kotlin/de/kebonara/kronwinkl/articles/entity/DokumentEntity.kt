package de.kebonara.kronwinkl.articles.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity(name = "dokument")
class DokumentEntity(
    @Id
    var id: UUID,
    var name: String,
    var title: String,
    var articleId: UUID
) {
}
