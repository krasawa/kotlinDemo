package demo.kotlin.kotlin.collections

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6)
    println("list has element grater then 4: ${list.any { it > 4 }}")

    println("fold = ${list.fold(0) {total, next -> total + next}}")

    println("sum = ${list.sum()}")

    println("all items less then 10: ${list.all { it < 10 }}")

    println("filter items grater then 3 = ${list.filter { it > 3 }}")

    println("first or null = ${list.firstOrNull()}")

    println("sort desc: ${list.sortedDescending()}")

    list.forEach {
        println(it)
    }

    list.filter { it % 2 == 0 }.map { it + 2 }.also { println(it) }
}