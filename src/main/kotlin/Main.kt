import fundamental.SmallestIntegerFinder

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(SmallestIntegerFinder().findSmallestInt(listOf(5, 2, -6, 4, 1, 24)))
    }
}