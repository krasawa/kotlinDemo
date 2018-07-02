package demo.kotlin.kotlin.properties.delegates

import kotlin.properties.Delegates


var observable by Delegates.observable("") {
    property, old, new -> println("Old value = $old, New value = $new")
}

fun main(args: Array<String>) {
    observable = "hello"
    observable = "hello2"
    observable = "hello3"
}