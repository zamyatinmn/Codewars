import fundamental.Solution

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(Solution.nameValue(arrayOf("abc", "abc abc")).contentToString())
        println(Solution.nameValue(arrayOf("codewars", "abc", "xyz")).contentToString())
    }
}