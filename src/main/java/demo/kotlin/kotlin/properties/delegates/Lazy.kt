package demo.kotlin.kotlin.properties.delegates

/**
 * Lazy in Java style
 */
private var lazyProperty: String? = null

fun getLazyProperty(): String {
    if (lazyProperty == null) {
        println("Init property")
        lazyProperty = "value"
    }
    return lazyProperty!!
}















/**
 *  Lazy in Kotlin style
 */
val lazyPropertyK: String by lazy {
    println("Init property")
    "value"
}

fun main(args: Array<String>) {
    for (i in 1..3) {
        println(getLazyProperty())
//        println(lazyPropertyK)
    }
}