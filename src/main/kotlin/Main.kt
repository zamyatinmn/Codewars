import fundamental.outed

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(
            outed(
                mapOf(
                    "tim" to 3,
                    "jim" to 9,
                    "randy" to 0,
                    "sandy" to 7,
                    "andy" to 6,
                    "katie" to 4,
                    "laura" to 9,
                    "saajid" to 6,
                    "alex" to 0,
                    "john" to 9,
                    "mr" to 3
                ), "andy"
            )
        )
        println(
            outed(
                mapOf(
                    "tim" to 2,
                    "jim" to 1,
                    "randy" to 6,
                    "sandy" to 6,
                    "andy" to 9,
                    "katie" to 7,
                    "laura" to 4,
                    "saajid" to 1,
                    "alex" to 5,
                    "john" to 6,
                    "mr" to 8
                ), "tim"
            )
        )
        println(
            outed(
                mapOf(
                    "tim" to 9,
                    "jim" to 7,
                    "randy" to 6,
                    "sandy" to 5,
                    "andy" to 9,
                    "katie" to 1,
                    "laura" to 5,
                    "saajid" to 7,
                    "alex" to 2,
                    "john" to 6,
                    "mr" to 3
                ), "randy"
            )
        )
    }
}