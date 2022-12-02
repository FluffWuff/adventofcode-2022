package Day2

import readFileAsLinesUsingUseLines

lateinit var input: List<String>

fun main() {
    input = readFileAsLinesUsingUseLines("C:\\Users\\Nutzer\\Desktop\\Developing\\AdvenOfCode\\Kotlin2022\\src\\main\\kotlin\\Day2\\Day2.txt")
    part1()
    part2()
}

fun part1() {
    var sum = 0
    input.forEach {
        val opponent = getValue(it.split(" ")[0])
        val me = getValue(it.split(" ")[1])
        //val notTaken = 6 - opponent - me
        if(opponent == me) sum += (me + 3)
        else if((me == 3 && opponent == 1) || (me == 1 && opponent == 2) || (me == 2 && opponent == 3)) sum += me
        else if((me == 1 && opponent == 3) || (me == 2 && opponent == 1) || (me == 3 && opponent == 2)) sum += (me + 6)
    }
    println(sum)

}

private fun getValue(action: String): Int {
    return when(action) {
        "A", "X" -> 1
        "B", "Y" -> 2
        "C", "Z" -> 3
        else -> -1
    }
}

fun part2() {
    var sum = 0
    input.forEach {
        val opponent = getValue(it.split(" ")[0])
        when(it.split(" ")[1]) {
            "X" -> sum += (getMoves(opponent).second + 0)
            "Y" -> sum += (opponent + 3)
            "Z" -> sum += (getMoves(opponent).first + 6)
        }
    }
    println(sum)
}

private fun getMoves(action: Int): Pair<Int, Int> {
    return when(action) {
        1 -> Pair(2, 3)
        2 -> Pair(3, 1)
        3 -> Pair(1, 2)
        else -> Pair(0, 0)
    }
}
