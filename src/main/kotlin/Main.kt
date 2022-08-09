import fundamental.abbrevName

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(abbrevName("Vasya Pupkin"))
        println(abbrevName("John Johnov"))
        println(abbrevName("John J"))
        println(abbrevName("John "))
    }
}