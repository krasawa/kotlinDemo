package demo.kotlin.kotlin.shorthand

fun max(a: Int, b: Int): Int {
    var result = a
    if (b > result)
        result = b

    return result
}

fun max2(a: Int, b: Int): Int {
    var result = 0
    if (a > b)
        result = a
    else
        result = b

    return result
}

fun max3(a: Int, b: Int): Int {
    return if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
}

fun max4(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max5(a: Int, b: Int): Int = if (a > b) a else b

fun max6(a: Int, b: Int) = if (a > b) a else b