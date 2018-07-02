package demo.kotlin.kotlin.control_flow

class ExampleWith(val a: Int, val b: String?, val c: Boolean)

fun main(args: Array<String>) {
    val ex = ExampleWith(25, "hello", false)
    with(ex) {
        val a = ex.a
        val b = ex.b
        val c = ex.c

        print("a = " + a + ", b =" +  b + ", c = " + c)
    }
}