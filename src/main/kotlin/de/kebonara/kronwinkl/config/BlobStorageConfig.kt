package de.kebonara.kronwinkl.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "storage")
data class BlobStorageConfig(
    var baseUrl: String = "",
    var dokuments: String = "",
    var images: String = ""
)