package rankup

fun productFib(prod: Long): LongArray {
    var num = 0L
    var numNext = 1L
    var product = 0L
    while (product < prod) {
        num = numNext.also { numNext += num }
        product = num * numNext
    }
    return longArrayOf(num, numNext, if (product == prod) 1 else 0)
}