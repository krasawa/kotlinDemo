package demo.kotlin.kotlin.shorthand

private val consentList = createConsentList()

data class ConsentK(val consentType: ConsentTypeK, val value: Boolean, val isRequired: Boolean, val isEnabled: Boolean)

enum class ConsentTypeK constructor(public val value: String) {
    TOU("Terms of use"),
    PRIVACY("Privacy policy"),
    PARENT_CONSENT("Parent consent"),
    ADS("Ads"), THIRD("Third party"),
    NON_EU_USER("non_eu")
}

fun isNonEuUser() = consentList.find { it.consentType == ConsentTypeK.NON_EU_USER }?.value

private fun createConsentList(): List<ConsentK> {
    return listOf(
            ConsentK(ConsentTypeK.TOU, false, true, true),
            ConsentK(ConsentTypeK.PRIVACY, false, true, true),
            ConsentK(ConsentTypeK.PARENT_CONSENT, false, true, true),
            ConsentK(ConsentTypeK.ADS, false, true, true),
            ConsentK(ConsentTypeK.THIRD, false, true, true),
            ConsentK(ConsentTypeK.NON_EU_USER, false, true, true))
}
















/**
 * In Java style
 */
fun onlyDigits(phoneNumber: String) : Boolean {
    var onlyDigits = true

    for (num in phoneNumber) {
        if (!num.isDigit()) {
            onlyDigits = false
            break
        }
    }
    return onlyDigits
}

/**
 * In Kotlin style
 */
fun onlyDigitsK(phoneNumber: String) = phoneNumber.all { it.isDigit() }


//fun main(args: Array<String>) {
//    val validPhone = "0964536273"
//    val invalidPhone = "074639hey"
//
//    println("Java onlyDigits:")
//    println("phone $validPhone has only digits: ${onlyDigits(validPhone)}")
//    println("phone $invalidPhone has only digits: ${onlyDigits(invalidPhone)}")
//
//    println("\nKotlin onlyDigits:")
//    println("phone $validPhone has only digits: ${onlyDigitsK(validPhone)}")
//    println("phone $invalidPhone has only digits: ${onlyDigitsK(invalidPhone)}")
//}