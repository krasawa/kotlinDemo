package demo.kotlin.kotlin.functions

/**
 * in Java style
 */
class StringUtils {
    fun getFirstName(fullName: String): String {
        return getFirstName(fullName, " ")
    }

    fun getFirstName(fullName: String, delimiter: String): String {
        return fullName.substringBefore(delimiter)
    }
}















/**
 * in Kotlin style
 */
fun getFirstNameK(fullName: String, delimiter: String = " "): String {
    return fullName.substringBefore(delimiter)
}






fun main(args: Array<String>) {
    val fullName = "Max Marus"

    //Java call
    println("Full name: $fullName\nFirst Name: ${StringUtils().getFirstName(fullName)}")

    //Kotlin call
    println("Full name: $fullName\nFirst Name: ${getFirstNameK(fullName)}")
}