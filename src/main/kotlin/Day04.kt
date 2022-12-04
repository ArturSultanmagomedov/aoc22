fun main() {
    val input = readInput("Day04")
    println(first(input))  // 305
    println(second(input)) // 811
}

private fun parseInput(input: String) = input.lines().map {
    it.split(",").map { m ->
        val t = m.split("-")
        t[0].toInt()..t[1].toInt()
    }
}

private fun first(input: String) = parseInput(input).count {
    (it[0].first in it[1] && it[0].last in it[1]) ||
            (it[1].first in it[0] && it[1].last in it[0])
}

private fun second(input: String) = parseInput(input).count {
    (it[0].first in it[1] || it[0].last in it[1]) ||
            (it[1].first in it[0] || it[1].last in it[0])
}
