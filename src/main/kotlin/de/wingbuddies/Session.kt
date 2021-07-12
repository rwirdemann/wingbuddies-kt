package de.wingbuddies

data class Session(val spot: String, val surfer: String, val wann: String)

val blogEntries = mutableListOf(
    Session(
        "Heiligenhafen",
        "Astrid, Kalle, Ralf",
        "Dienstag, 27. Juli 2021"
    ),
    Session(
        "Kellenhusen",
        "Marcel, Lutz, Carsten",
        "Mittwoch, 15. April 2021"
    )
)