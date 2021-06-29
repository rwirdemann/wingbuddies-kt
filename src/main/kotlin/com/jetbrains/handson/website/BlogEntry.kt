package com.jetbrains.handson.website

data class BlogEntry(val headline: String, val body: String)

val blogEntries = mutableListOf(
    BlogEntry(
        "27. Juli 2021, Heiligenhafen",
        "Es erwartet Sie ein toller Tag am Meer, mit Wind, Wellen und Cocktails."
    ),
    BlogEntry(
        "15. April 2021, Kellenhusen",
        "Schöne Wellen, wenig Leute und eine tolle Wiese zum aufpumpen oder Pause machen."
    )
)