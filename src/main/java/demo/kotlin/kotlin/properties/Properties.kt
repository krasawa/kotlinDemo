package demo.kotlin.kotlin.properties



/**
 * in Java style
 */
class Test {
    private var some: String = "some"

    fun getSome(): String {
        return some
    }

    fun setSome(value: String) {
        some = value
    }
}


























/**
 * in Kotlin style
 */
private var other = "other"
    set(value) {
    print("new value = $value")
    field = value
}


fun main(arr: Array<String>) {
    other = "hello"
}