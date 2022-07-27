import fundamental.makeComplement

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(makeComplement("ACTTG"))
        println(makeComplement("AAATTT"))
    }
}