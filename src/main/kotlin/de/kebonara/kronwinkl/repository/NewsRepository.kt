package de.kebonara.kronwinkl.repository

import de.kebonara.kronwinkl.entity.News
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface NewsRepository : JpaRepository<News, UUID> {
}
