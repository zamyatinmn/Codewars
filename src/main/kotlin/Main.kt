import fundamental.KataSolution

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(KataSolution.multiplicationTable(3).contentDeepToString())
        println(KataSolution.multiplicationTable(10).contentDeepToString())
    }
}