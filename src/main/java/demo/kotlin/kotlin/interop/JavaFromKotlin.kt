package demo.kotlin.kotlin.interop

import demo.kotlin.java.interop.Foo
import java.util.*

class JavaFromKotlin {

    fun calendarDemo() {
        val calendar = Calendar.getInstance()
        if (calendar.firstDayOfWeek == Calendar.SUNDAY) {  // call getFirstDayOfWeek()
            calendar.firstDayOfWeek = Calendar.MONDAY      // call setFirstDayOfWeek()
        }
        if (!calendar.isLenient) {                         // call isLenient()
            calendar.isLenient = true                      // call setLenient()
        }
    }

    fun escapeReservedKotlinWords() {
        Foo().`is`()
    }
}