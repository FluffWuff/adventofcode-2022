package Day4

import readFileAsLinesUsingUseLines

private lateinit var input: List<String>

fun main() {
    input = readFileAsLinesUsingUseLines("C:\\Users\\Nutzer\\Desktop\\Developing\\AdventOfCode\\2022\\src\\main\\kotlin\\Day4\\Day4.txt")
    part1()
    part2()
}

private fun part1() {
    var sum = 0
    input.forEach {
        val f = it.split(",")[0]
        val s = it.split(",")[1]
        val fRange = IntRange(f.split("-")[0].toInt(), f.split("-")[1].toInt())
        val sRange = IntRange(s.split("-")[0].toInt(), s.split("-")[1].toInt())
        if(fRange.subtract(sRange).isEmpty() || sRange.subtract(fRange).isEmpty()) sum++
    }
    println(sum)
}

private fun part2() {
    var sum = 0
    input.forEach {
        val f = it.split(",")[0]
        val s = it.split(",")[1]
        val fRange = IntRange(f.split("-")[0].toInt(), f.split("-")[1].toInt())
        val sRange = IntRange(s.split("-")[0].toInt(), s.split("-")[1].toInt())
        if(fRange.any { i -> sRange.contains(i) } || sRange.any { i -> fRange.contains(i)}) sum++
    }
    println(sum)
}
