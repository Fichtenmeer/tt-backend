package de.kebonara.kronwinkl.articles.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
class ImgMeta(
    @Id
    var id: UUID,
    var name: String,
    var alt: String,
    var articleId: UUID
) {
}
