import fundamental.DoubleSort

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(
            DoubleSort.dbSort(arrayOf("Apple", 46, "287", 574, "Peach", "3", "69", 78, "Grape", "423"))
                .contentToString()
        )
    }
}