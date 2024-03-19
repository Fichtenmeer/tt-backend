package de.kebonara.kronwinkl.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
class ImgMeta(
    @Id
    var id: UUID,
    var filename: String,
    var alt: String
) {
}
