package fundamental

fun grow(arr: IntArray) = if (arr.contains(0)) 0 else arr.reduce { acc, i -> acc * i }