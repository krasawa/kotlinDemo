package demo.kotlin.java.kotlin

/**
 * Equals
 */

data class Post(val title: String, val body: String)

fun main(args: Array<String>) {
    val post = Post("Kotlin article", "One more lang or something more?")
    val post2 = Post("Kotlin article", "One more lang or something more?")

    if (post != post2) {
        println("Equals doesn't work")
    } else {
        println("Objects are equal")
    }
}