package demo.kotlin.kotlin.control_flow

/**
 * in Java style
 */
fun checkCurrentMillis() {
    var result: Int = -1
    if (System.currentTimeMillis() % 2 == 0L) {
        result = 100
    } else {
        result = 0
    }
    println("Java result = $result")
}


/**
 * in Kotlin style
 */
fun checkCurrentMillisK() {
    val result = if (System.currentTimeMillis() % 2 == 0L) {
        100
    } else {
        0
    }
    println("Kotlin result = $result")
}

fun main(args: Array<String>) {
    checkCurrentMillis()

    checkCurrentMillisK()
}