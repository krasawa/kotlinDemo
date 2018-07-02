package demo.kotlin.kotlin.properties

import demo.kotlin.java.User

/* Nullable */

fun printStringByCharacters(str: String?) {
    println("String length = ${str!!.length}")

    if (str != null) {
        str.forEach {
            println(it)
        }
    }
}

var user: User? = null

fun main(arr: Array<String>) {
//    printStringByCharacters(null)
//    printStringByCharacters("kotlin is awesome")

    user = User("Bob", 24)

    user?.let {
        println("User: ${it.name}, ${it.age}")
    }
}

