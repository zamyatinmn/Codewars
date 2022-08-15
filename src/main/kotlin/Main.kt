import fundamental.incrementString

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(incrementString("foo09"))
        println(incrementString("f845oo14"))
        println(incrementString("54foo0154"))
        println(incrementString("adasfsdf"))
        println(incrementString("00099"))
    }
}