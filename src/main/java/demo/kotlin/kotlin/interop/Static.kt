package demo.kotlin.kotlin.interop

class CompanionTest {
    companion object {
        @JvmStatic fun foo() {}
        fun bar() {}
    }
}

object ObjectTest {
    @JvmStatic fun foo() {}
    fun bar() {}
}