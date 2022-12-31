fun main() {
    fun part1(input: List<String>): Int {
        val weights = mutableListOf<List<Int>>()
        val subList = mutableListOf<Int>()
        input.forEach {
            if (it == "") {
                val newList = mutableListOf<Int>()
                newList.addAll(subList)
                weights.add(newList)
                subList.clear()
            } else subList.add(it.toInt())
        }
        weights.sortByDescending { it.sum() }
        return weights.first().sum()
    }

    fun part2(input: List<String>): Int {
        val weights = mutableListOf<List<Int>>()
        val subList = mutableListOf<Int>()
        input.forEach {
            if (it == "") {
                val newList = mutableListOf<Int>()
                newList.addAll(subList)
                weights.add(newList)
                subList.clear()
            } else subList.add(it.toInt())
        }
        weights.sortByDescending { it.sum() }
        return weights.subList(0, 3).flatten().sum()
    }

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
