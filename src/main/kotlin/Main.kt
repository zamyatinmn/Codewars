import fundamental.duplicateCount

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(duplicateCount("abcde"))
        println(duplicateCount("indivisibility"))
        println(duplicateCount("Indivisibilities"))
    }
}