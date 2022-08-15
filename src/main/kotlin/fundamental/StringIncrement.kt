package fundamental

/**
Your job is to write a function which increments a string, to create a new string.

If the string already ends with a number, the number should be incremented by 1.
If the string does not end with a number. the number 1 should be appended to the new string.
Examples:

foo -> foo1

foobar23 -> foobar24

foo0042 -> foo0043

foo9 -> foo10

foo099 -> foo100

Attention: If the number has leading zeros the amount of digits should be considered.*/

fun incrementString(str: String): String {
    val sliceIndex = str.indexOfLast { it.isLetter() } + 1
    val text = str.substring(0, sliceIndex)
    val stringNumber = str.takeLastWhile { it.isDigit() }
    val number = ((stringNumber.toIntOrNull() ?: 0) + 1).toString().padStart(stringNumber.length, '0')
    return "$text$number"
}