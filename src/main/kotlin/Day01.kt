fun main() {
    val input = readInput("Day01")
    println(first(input))
    println(second(input))
}

private fun first(input: String) = input.split("\n\n").maxOf {
    it.split("\n").sumOf { m -> m.toInt() }
}

private fun second(input: String) = input.split("\n\n").map {
    it.split("\n").sumOf { m -> m.toInt() }
}.sorted().takeLast(3).sum()
