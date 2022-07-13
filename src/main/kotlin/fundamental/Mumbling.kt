package fundamental

/**
This time no story, no theory. The examples below show you how to write function accum:

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"*/

fun accum(s:String):String {
    var new = ""
    s.forEachIndexed { index, c ->
        if (index != 0) new += "-"
        new += c.uppercase()
        repeat(index) {
            new += c.lowercase()
        }
    }
    return new
}