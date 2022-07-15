import fundamental.getAscii

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(getAscii('A'))
        println(getAscii(' '))
        println(getAscii('!'))
    }
}