package demo.kotlin.kotlin.functions

inline fun repeat(times: Int, body: (Int) -> Unit) {
    for (index in 0 until times) {
        body(index)
    }
}


fun main(args: Array<String>) {
    repeat(3) {
        println("ho")
    }
}