package demo.kotlin.kotlin.coroutines

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlin.concurrent.thread

fun main(args: Array<String>) = threads(100_000)

fun threads(count: Int) {
    val threads = List(count) {
        thread {
            Thread.sleep(1000L)
            println(it)
        }
    }

    threads.forEach { it.join() }
}




fun coroutines(count: Int) = runBlocking{
    val jobs = List(count) {
        async {
            delay(1000L)
            println(it)
        }
    }
    jobs.forEach { it.join() }
}