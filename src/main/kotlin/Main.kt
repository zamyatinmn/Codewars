import rankup.longToIP

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(0b10001000100010001111111100100010 shr 8 and 255)
//        println(0b11111111000000000000000000000000 and 255 shl 24)
//        println(0b00000000111111110000000000000000)
//        println(0b00000000000000001111111100000000)
//        println(0b00000000000000001111111111111111)
//        println(255 shl 8)
        println(longToIP(2149583361u))
        println(longToIP(32u))
    }
}