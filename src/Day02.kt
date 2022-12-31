fun main() {
    fun part1(input: List<String>): Int {
        var sum = 0
        val values = mapOf(
            "A" to 1,
            "B" to 2,
            "C" to 3,
            "X" to 1,
            "Y" to 2,
            "Z" to 3,
        )

        input.forEach {
            val inp = it.split(" ")
            val opponent = inp[0]
            val my = inp[1]
            sum += if (values[opponent] == values[my]) {
                values[my]!! + 3
            } else if (values[my]!! - values[opponent]!! == 1 || values[opponent]!! - values[my]!! == 2) {
                values[my]!! + 6
            } else {
                values[my]!! + 0
            }
        }
        return sum
    }

    fun part2(input: List<String>): Int {
        var sum = 0
        val values = mapOf(
            "A X" to 3,
            "A Y" to 4,
            "A Z" to 8,
            "B X" to 1,
            "B Y" to 5,
            "B Z" to 9,
            "C X" to 2,
            "C Y" to 6,
            "C Z" to 7,
        )

        input.forEach {
            sum += values[it]!!
        }
        return sum
    }

    val input = readInput("Day02")
    part1(input).println()
    part2(input).println()
}
