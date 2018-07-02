package demo.kotlin.kotlin.classes

open class Profile {
    open var minAge = 18
    open val name = ""
    open fun sayHello() {
        print("My name is $")
    }
}

class Friend: Profile() {
    override var minAge = 16
    override var name = "Max"

    override fun sayHello() {

    }
}