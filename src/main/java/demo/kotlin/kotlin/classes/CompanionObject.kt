package demo.kotlin.kotlin.classes


interface Factory<T> {
    fun create(): T
}

class Monster {
    companion object: Factory<Monster> {
        override fun create(): Monster = Monster()
    }
}

fun main(args: Array<String>) {
    val instance = Monster.create()
}