package demo.kotlin.kotlin.functions

fun String.getFirstWord(separator: String): String {
    val index = indexOf(separator)
    return if (index < 0) this else substringBefore(separator)
}

val String.firstWord: String
    get() {
        val index = indexOf(" ")
        return if (index < 0) this else substring(0, index)
    }


fun main(args: Array<String>) {
    print("Kotlin awesome".getFirstWord(" "))
}