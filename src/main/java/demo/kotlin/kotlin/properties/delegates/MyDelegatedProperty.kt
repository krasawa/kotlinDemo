package demo.kotlin.kotlin.properties.delegates

import kotlin.reflect.KProperty

class ExampleDelegate {
    var prop: String by Delegate()

    override fun toString() = "ExampleDelegate Class"
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun main(args: Array<String>) {
    val example = ExampleDelegate()
    println(example.prop)
    example.prop = "NEW"
}