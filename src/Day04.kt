fun main() {
    fun part1(input: List<String>): Int {
        val pairs = input.map { it ->
            val (range1, range2) = it.split(",")
            val (start1, end1) = range1.split("-").map { it.toInt() }
            val (start2, end2) = range2.split("-").map { it.toInt() }
            Pair(start1..end1, start2..end2)
        }

        val count = pairs.count { (range1, range2) ->
            range1.first <= range2.first && range1.last >= range2.last ||
                    range2.first <= range1.first && range2.last >= range1.last
        }
        
        return count
    }

    fun part2(input: List<String>): Int {
        val pairs = input.map { it ->
            val (range1, range2) = it.split(",")
            val (start1, end1) = range1.split("-").map { it.toInt() }
            val (start2, end2) = range2.split("-").map { it.toInt() }
            Pair(start1..end1, start2..end2)
        }

        val count = pairs.count { (range1, range2) ->
            range1.intersect(range2).isNotEmpty()
        }

        return count
    }

    val input = readInput("Day04")
    part1(input).println()
    part2(input).println()
}