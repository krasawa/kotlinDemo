@file:JvmName("StringUtil")
package demo.kotlin.kotlin.interop

@JvmOverloads
fun getFirstName(fullName: String, delimiter: String = " "): String {
    return fullName.substringBefore(delimiter)
}