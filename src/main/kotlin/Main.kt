import fundamental.catMouse

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(catMouse("C....m"))
        println(catMouse("C...m"))
        println(catMouse("..C...m"))
    }
}