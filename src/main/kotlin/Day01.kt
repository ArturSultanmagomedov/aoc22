fun main() {
    val input = readInput("Day01")
    println(first(input))  // 67450
    println(second(input)) // 199357
}

private fun first(input: String) = input.split("\n\n").maxOf {
    it.lines().sumOf(String::toInt)
}

private fun second(input: String) = input.split("\n\n").map {
    it.lines().sumOf(String::toInt)
}.sorted().takeLast(3).sum()
