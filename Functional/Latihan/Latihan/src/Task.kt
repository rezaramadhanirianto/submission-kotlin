fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    println(firstChar)
    println(lastChar)

}

// TODO 1
fun String.getFirstAndLast() = mapOf(
        "first" to this.first(),
        "last" to this.last()
)