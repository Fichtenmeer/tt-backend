package de.kebonara.kronwinkl.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDate
import java.util.*

@Entity
class News(
    @Id
    var id: UUID,
    var title: String,
    var date: LocalDate,
    var html: String,
    var typ: NewsTyp
) {
}
