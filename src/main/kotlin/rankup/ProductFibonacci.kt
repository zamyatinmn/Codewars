package rankup

fun productFib(prod: Long): LongArray {
    var (num, numNext, check) = longArrayOf(0, 1, 0)
    while (check < prod) {
        num = numNext.also { numNext += num }
        check = num * numNext
    }
    return longArrayOf(num, numNext, if (check == prod) 1 else 0)
}