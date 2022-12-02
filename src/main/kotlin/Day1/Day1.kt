package Day1
import readFileAsLinesUsingUseLines

fun main() {
    part1()
    part2()
}

fun part1() {
    val input = readFileAsLinesUsingUseLines("C:\\Users\\Nutzer\\Desktop\\Developing\\AdvenOfCode\\Kotlin2022\\src\\main\\kotlin\\Day1\\Day1.txt")
    println(input)
    val calories = mutableListOf<Int>(0)
    var current = 0
    input.forEach {
        if(it.isNotEmpty()) {
            calories[calories.indexOf(calories.last())] = calories.last() + it.toInt()
        } else calories.add(0)
    }
    println(calories.max())
}

fun part2() {
    val input = readFileAsLinesUsingUseLines("C:\\Users\\Nutzer\\Desktop\\Developing\\AdvenOfCode\\Kotlin2022\\src\\main\\kotlin\\Day1\\Day1.txt")
    println(input)
    val calories = mutableListOf<Int>(0)
    var current = 0
    input.forEach {
        if(it.isNotEmpty()) {
            calories[calories.indexOf(calories.last())] = calories.last() + it.toInt()
        } else calories.add(0)
    }
    var sum = 0
    for (i in 0..2) {
        sum += calories.max()
        calories.remove(calories.max())
    }
    println(sum)
}