package de.wingbuddies.database

import com.mongodb.client.FindIterable
import com.mongodb.client.MongoDatabase
import de.wingbuddies.Session
import org.litote.kmongo.KMongo
import org.litote.kmongo.getCollection

data class Jedi(val name: String, val age: Int)

val client = KMongo.createClient()
val database: MongoDatabase = client.getDatabase("wingbuddies")
val col = database.getCollection<Session>()

fun main() {
    list()
}

private fun list() {
    val sessions: FindIterable<Session> = col.find()
    sessions.forEach { s ->
        println(s)
    }
}