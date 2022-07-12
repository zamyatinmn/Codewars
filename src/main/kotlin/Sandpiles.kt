class Sandpile(piles: String = "", rows: Int = 3, columns: Int = 3) {

    private val nodes = Array(rows) { Array(columns) { 0 } }

    init {
        if (piles.isNotEmpty()) {
            val input = piles.split("\n")
            nodes.forEachIndexed { ir, row ->
                row.forEachIndexed { ic, _ ->
                    nodes[ir][ic] = input[ir][ic].digitToInt()
                }
            }

            var needDo: Boolean
            do {
                needDo = false
                nodes.forEachIndexed { ir, row ->
                    row.forEachIndexed { ic, col ->
                        if (col > 3) {
                            needDo = true
                            nodes[ir][ic] -= 4
                            if (ic != 0) nodes[ir][ic-1] += 1
                            if (ic != row.size - 1) nodes[ir][ic+1] += 1
                            if (ir != 0) nodes[ir-1][ic] += 1
                            if (ir != nodes.size - 1) nodes[ir+1][ic] += 1
                        }
                    }
                }
            } while (needDo)
        }
    }

    fun add(sandpile: Sandpile): Sandpile {
        assert(nodes.size == sandpile.nodes.size && nodes[0].size == sandpile.nodes[0].size)

        var result = ""
        nodes.forEachIndexed { ir, row ->
            if (ir != 0) result += "\n"
            row.forEachIndexed { ic, col ->
                result += col + sandpile.nodes[ir][ic]
            }
        }
        return Sandpile(result, nodes.size, nodes[0].size)
    }

    override fun toString(): String {
        var result = ""
        nodes.forEachIndexed { i, row ->
            if (i != 0) result += "\n"
            row.forEach { col ->
                result += col
            }
        }
        return result
    }
}