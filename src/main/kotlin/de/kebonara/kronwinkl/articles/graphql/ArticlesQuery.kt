package de.kebonara.kronwinkl.articles.graphql

import de.kebonara.kronwinkl.articles.model.Article
import de.kebonara.kronwinkl.articles.model.Dokument
import de.kebonara.kronwinkl.articles.model.ImgMeta
import de.kebonara.kronwinkl.articles.service.ArticleService
import de.kebonara.kronwinkl.articles.service.DokumentService
import de.kebonara.kronwinkl.articles.service.ImgMetaService
import org.springframework.graphql.data.method.annotation.BatchMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller


@Controller
class ArticlesQuery(
    val articleService: ArticleService,
    val dokumentService: DokumentService,
    val imgMetaService: ImgMetaService
) {
    @QueryMapping
    fun articles(): List<Article> = articleService.getArticles()

    @BatchMapping
    fun images(articles: List<Article>): Map<Article, List<ImgMeta>> =
        imgMetaService.getImgMetas(articles).map { (articleId, imgMetas) ->
            val article = articles.first { it.id == articleId }
            article to imgMetas
        }.toMap()

    @BatchMapping
    fun dokuments(articles: List<Article>): Map<Article, List<Dokument>> =
        dokumentService.getDokuments(articles).map { (articleId, dokuments) ->
            val article = articles.first { it.id == articleId }
            article to dokuments
        }.toMap()
}
