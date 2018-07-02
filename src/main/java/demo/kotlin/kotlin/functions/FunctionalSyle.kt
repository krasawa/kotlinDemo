package demo.kotlin.kotlin.functions

/**
 * In Java style
 */
fun toHex() {
    val numbers = (1..100).toList()
    val list = mutableListOf<String>()

    for (num in numbers) {
        if (num % 16 == 0) {
            list.add("0x" + num.toString(16))
        }
    }
    println(list)
}













/**
 * In Kotlin style
 */
fun toHexK() {
    val numbers = (1..100).toList()
    println(numbers.
            filter { it -> it % 16 == 0 }
            .also { println(it) }
            .map { it -> "0x" + it.toString(16) })
}


//fun main(args: Array<String>) {
//    toHex()
////    toHexK()
//}