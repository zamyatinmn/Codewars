import fundamental.points

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3")))
        println(points(listOf("1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4")))
    }
}