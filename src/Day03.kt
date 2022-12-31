fun main() {
    fun part1(input: List<String>): Int {
        val sum = input.sumOf {
            val itemType = it.substring(0, it.length / 2).toSet()
                .intersect(it.substring(it.length / 2).toSet()).first()
            val priority = if (itemType.isLowerCase())
                itemType - 'a' + 1
            else
                itemType - 'A' + 27
            priority
        }
        return sum
    }

    fun part2(input: List<String>): Int {
        var sum = 0
        for (i in input.indices step 3) {
            val group = input.subList(i, i + 3)
            val sets = group.map { it.toSet() }
            val itemType = sets[0].intersect(sets[1]).intersect(sets[2]).single()
            val priority = if (itemType.isLowerCase())
                itemType - 'a' + 1
            else
                itemType - 'A' + 27
            sum += priority
        }
        return sum
    }

    val input = readInput("Day03")
    part1(input).println()
    part2(input).println()
}
