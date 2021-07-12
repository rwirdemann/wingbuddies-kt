@file:Suppress("unused")

package de.wingbuddies

import freemarker.cache.ClassTemplateLoader
import freemarker.core.HTMLOutputFormat
import io.ktor.application.*
import io.ktor.freemarker.*
import io.ktor.http.*
import io.ktor.http.content.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import java.time.LocalDate
import java.time.format.DateTimeFormatter


fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    install(FreeMarker) {
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "templates")
        outputFormat = HTMLOutputFormat.INSTANCE
    }
    routing {
        static("/static") { resources("/files") }
        get("/") {
            call.respond(FreeMarkerContent("index.ftl", mapOf("entries" to blogEntries), ""))
        }
        post("/submit") {
            val params = call.receiveParameters()
            val headline = params["headline"] ?: return@post call.respond(HttpStatusCode.BadRequest)
            val text = params["when"]?: return@post call.respond(HttpStatusCode.BadRequest)
            var date = LocalDate.parse(text)
            var formatter = DateTimeFormatter.ofPattern("EEEE, dd. MMMM YYYY")
            var formattedDate = date.format(formatter)
            val surfers = "Astrid, Ralf, Kalle, ..."
            val newEntry = Session(headline, surfers, formattedDate)
            blogEntries.add(0, newEntry)
            call.respondRedirect("/")
        }
    }
}
