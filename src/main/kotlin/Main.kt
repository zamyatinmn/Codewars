object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(include(intArrayOf(1,2,3), 1))
        println(include(intArrayOf(1,2,3), 4))
    }
}