package fundamental

/**
Your task, is to create NxN multiplication table, of size provided in parameter.

for example, when given size is 3:

1 2 3
2 4 6
3 6 9
for given example, the return value should be: [[1,2,3],[2,4,6],[3,6,9]]*/

object KataSolution {
    fun multiplicationTable(size: Int) = Array(size) { x -> IntArray(size) { y -> (x + 1) * (y + 1) } }
}