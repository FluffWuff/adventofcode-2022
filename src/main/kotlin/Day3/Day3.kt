package Day3

import readFileAsLinesUsingUseLines

lateinit var input: List<String>

fun main() {
    input = readFileAsLinesUsingUseLines("C:\\Users\\Nutzer\\Desktop\\Developing\\AdventOfCode\\2022\\src\\main\\kotlin\\Day3\\Day3.txt")
    part1()
    part2()
}

fun part1() {
    var sum = 0
    input.forEach {
        val first = it.substring(0..(it.length/2))
        sum += getLetterValue(first[first.indexOfFirst { c -> it.substring((it.length/2) until it.length).contains(c) }])
    }
    println(sum)
}

private fun getLetterValue(letter: Char): Int {
    return if(letter.isUpperCase()) letter.code - 38 else letter.code - 96
}

fun part2() {
    var sum = 0
    for(i in 0 until (input.size/3))
        sum += getLetterValue(input[i*3][input[i*3].indexOfFirst { c -> input[3*i+1].contains(c) && input[3*i+2].contains(c) }])
    println(sum)
}
