import fundamental.evaporator

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(evaporator(10.0, 10.0, 10.0))
        println(evaporator(10.0, 10.0, 5.0))
        println(evaporator(100.0, 5.0, 5.0))
    }
}