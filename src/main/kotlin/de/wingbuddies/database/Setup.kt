package de.wingbuddies.database

import de.wingbuddies.Session
import org.litote.kmongo.EMPTY_BSON

fun main() {
    setup()
}

private fun setup() {
    col.deleteMany(EMPTY_BSON)
    col.insertOne(
        Session(
            "Heiligenhafen",
            "Astrid, Kalle, Ralf",
            "Dienstag, 27. Juli 2021"
        )
    )
    col.insertOne(
        Session(
            "Kellenhusen",
            "Marcel, Lutz, Carsten",
            "Mittwoch, 15. April 2021"
        )
    )
}