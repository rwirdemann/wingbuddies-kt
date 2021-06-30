package com.jetbrains.handson.website

data class Session(val spot: String, val surfer: String, val wann: String)

val blogEntries = mutableListOf(
    Session(
        "Heiligenhafen",
        "Astrid, Kalle, Ralf",
        "27. Juli 2021"
    ),
    Session(
        "Kellenhusen",
        "Marcel, Lutz, Carsten",
        "15. April 2021"
    )
)