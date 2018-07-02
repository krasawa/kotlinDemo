package demo.kotlin.kotlin.properties.delegates

import kotlin.properties.Delegates

var age by Delegates.vetoable(0) {
    _, old, new ->
    val isAgeValid = new in 13..90
    println("isAgeValid = $isAgeValid")
    isAgeValid
}

fun main(args: Array<String>) {
    age = 25
    println("Age = $age")

    age = 50
    println("Age = $age")

    age = 100
    println("Age = $age")

}