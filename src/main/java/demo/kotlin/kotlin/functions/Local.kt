package demo.kotlin.kotlin.functions

fun sumEven(list: List<Int>): Int {
    var result = 0

    fun filterEven(): List<Int> {
        return list.filter { it % 2 == 0 }
    }

    return filterEven().sum()
}

fun main(args: Array<String>) {
    val list = (1..10).toList()
    println(sumEven(list))
}