package demo.kotlin.kotlin.control_flow

fun whenTestJava(example: ExampleWith): String {
    when (example.a) {
        1 -> return "Odd"
        2 -> return "Even"
        3 -> return "Odd"
        4 -> return "Even"
        5 -> return "Odd"
        else -> return "Other"
    }
}

fun whenTestKotlin(example: ExampleWith) = when (example.a) {
    1, 3, 5 -> "Odd"
    2, 4, 6 -> "Even"
    in setOf(22, 44, 66) -> "Even"
    else -> "Other"
}