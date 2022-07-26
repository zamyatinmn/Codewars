import fundamental.beggars

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(beggars(listOf(1, 2, 3, 4, 5), 1))
        println(beggars(listOf(1, 2, 3, 4, 5), 2))
        println(beggars(listOf(1, 2, 3, 4, 5), 0))
    }
}