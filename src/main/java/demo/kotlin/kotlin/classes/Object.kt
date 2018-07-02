package demo.kotlin.kotlin.classes

import demo.kotlin.java.User
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JComponent

/**
 * Object expressions
 */
interface DialogClickListener {
    fun onCancel()
    fun onAgree()
}

var listener: DialogClickListener? = null

fun initListener() {
    listener = object : DialogClickListener {
        override fun onCancel() {

        }

        override fun onAgree() {

        }
    }
}

fun getPoint() {
    val point = object {
        var x: Int = 0
        var y: Int = 0
    }
    print(point.x + point.y)
}


class C {
    // Private function, so the return type is the anonymous object type
    private fun foo() = object {
        val x: String = "x"
    }

    // Public function, so the return type is Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x        // Works
//        val x2 = publicFoo().x  // ERROR: Unresolved reference 'x'
    }
}


fun countClicks(window: JComponent) {
    var clickCount = 0
    var enterCount = 0

    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            clickCount++
        }

        override fun mouseEntered(e: MouseEvent) {
            enterCount++
        }
    })
}


/**
 * Object declaration
 */
object UserManager {
    lateinit var user: User
}

fun main(args: Array<String>) {
    UserManager.user = User("Droidtest", 44)

    println(UserManager.user)
}