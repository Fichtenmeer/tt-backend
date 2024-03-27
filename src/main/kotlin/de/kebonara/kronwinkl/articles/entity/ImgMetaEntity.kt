package de.kebonara.kronwinkl.articles.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity(name = "img_meta")
class ImgMetaEntity(
    @Id
    var id: UUID,
    var name: String,
    var alt: String,
    var articleId: UUID
) {
}
