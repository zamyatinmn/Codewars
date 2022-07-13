import rankup.orderWeight

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(orderWeight("103 123 4444 99 2000"))
        println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"))
    }
}