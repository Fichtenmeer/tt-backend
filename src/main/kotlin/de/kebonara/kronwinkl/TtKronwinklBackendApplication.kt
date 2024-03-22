package de.kebonara.kronwinkl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties
class TtKronwinklBackendApplication

fun main(args: Array<String>) {
	runApplication<TtKronwinklBackendApplication>(*args)
}
