package de.kebonara.kronwinkl.articles.rest

import de.kebonara.kronwinkl.articles.rest.dto.CreateArticleDto
import de.kebonara.kronwinkl.articles.service.ArticleService
import de.kebonara.kronwinkl.articles.service.DokumentService
import de.kebonara.kronwinkl.articles.service.ImgMetaService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/articles")
@RestController
class CreateArticleController(
    val articleService: ArticleService,
    val dokumentService: DokumentService,
    val imgMetaService: ImgMetaService
) {
    @PostMapping
    fun createArticle(@RequestBody article: CreateArticleDto) {
        val created = articleService.createArticle(article)
        if (article.dokumente != null) {
            dokumentService.createDokument(article.dokumente, created.id)
        }
        if (article.imgMeta != null) {
            imgMetaService.createImgMeta(article.imgMeta, created.id)
        }
    }
}
