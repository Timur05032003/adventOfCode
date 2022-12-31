fun main() {
    fun part1(input: String): Int {
        val buffer = mutableListOf<Char>()
        for ((index, character) in input.withIndex()) {
            buffer.add(character)
            if (buffer.size >= 4) {
                if (buffer.distinct().size == 4)
                    return index + 1
                buffer.removeAt(0)
            }
        }

        return -1
    }

    fun part2(input: String): Int {
        val buffer = mutableListOf<Char>()
        for ((index, character) in input.withIndex()) {
            buffer.add(character)
            if (buffer.size >= 14) {
                if (buffer.distinct().size == 14)
                    return index + 1
                buffer.removeAt(0)
            }
        }

        return -1
    }

    val input = readInput("Day06")
    part1(input.first()).println()
    part2(input.first()).println()
}