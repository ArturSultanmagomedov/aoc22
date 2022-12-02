fun main() {
    val input = readInput("Day02")
    println(first(input))  // 8890
    println(second(input)) // 10238
}

private fun first(input: String) = input.lines().sumOf {
    when (it) {
        "A X" -> 4;"A Y" -> 8;"A Z" -> 3L
        "B X" -> 1;"B Y" -> 5;"B Z" -> 9
        "C X" -> 7;"C Y" -> 2;"C Z" -> 6
        else -> error("wtf dude")
    }
}

private fun second(input: String) = input.lines().sumOf {
    when (it) {
        "A X" -> 3;"A Y" -> 4;"A Z" -> 8L
        "B X" -> 1;"B Y" -> 5;"B Z" -> 9
        "C X" -> 2;"C Y" -> 6;"C Z" -> 7
        else -> error("wtf dude")
    }
}
