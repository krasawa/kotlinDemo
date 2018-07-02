package demo.kotlin.kotlin.collections

fun main(args: Array<String>) {
//in Java style
    val map = HashMap<Int, String>()
    map.put(1, "one")
    map.put(2, "two")
    map.put(3, "three")

//in Kotlin style
    val mapK = mapOf(
            1 to "one",
            2 to "two",
            3 to "three"
    )

//in Java style
    for (entry in mapK.entries) {
        val key = entry.key
        val value = entry.value
        println("$key -> $value")
    }

//in Kotlin style
    for ((key, value) in mapK) {
        println("$key -> $value")
    }
}