package demo.kotlin.kotlin

fun forLoopExample() {
    val list = arrayListOf<String>("3", "5", "12")
    for ((index, element) in list.withIndex()) {
        println("$index - $element")
    }
}

fun main(args: Array<String>) {
//    forLoopExample()

//    println("Kotlin" in "Java".."Scala")

//    val set = hashSetOf(1,2,3)
//    val hashMap = hashMapOf(1 to "one", 5 to "five")
//    val list = arrayListOf(1, 2, 3)
//
//    println("set = ${set.javaClass}")
//    println("hashMap = ${hashMap.javaClass}")
//    println("list = ${list.javaClass}")

    val listStr = arrayListOf("one", "two", "three")
//    print(joinToString(listStr, "{", "}", ";"))
    print(joinToString(listStr))
}

fun <T> joinToString(list: Collection<T>, prefix: String = "", postfix: String = "", divider: String = ","): String {
    val sb = StringBuilder(prefix)

    for ((index, value) in list.withIndex()) {
        if (index > 0) sb.append(divider)
        sb.append(value)
    }
    sb.append(postfix)
    return sb.toString()
}