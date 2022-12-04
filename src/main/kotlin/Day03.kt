fun main() {
    val input = readInput("Day03")
    println(first(input))  // 7428
    println(second(input)) // 2650
}

private fun first(input: String) = input.lines().sumOf {
    val c = it.chunked(it.length / 2).run {
        first().toList().filter { f -> last().contains(f) }
    }[0]
    if (c in 'a'..'z') c.code - 96
    else c.code - 38
}

private fun second(input: String) = input.lines().chunked(3).sumOf {
    val c = it[0].filter { f -> it[1].contains(f) && it[2].contains(f) }[0]
    if (c in 'a'..'z') c.code - 96
    else c.code - 38
}
