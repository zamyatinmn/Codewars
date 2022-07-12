/**Learn about Sandpile numbers from Numberphile!

Let's learn about a new type of number: the Sandpile.

What are Sandpiles?
A sandpile is a grid of piles of sand ranging from 0 to some max integer value. For simplicity's sake, we'll look at a 3x3 grid containing 0, 1, 2, or 3 grains of sand.

An example of this sort of sandpile might look like this:

1 3 0     . ∴
1 2 1  =  . : .
3 2 2     ∴ : :
This means that in row one, column one, there's 1 grain of sand, then 3 grains, then 0, etc.

Sandpile Math
I mentioned that Sandpiles are a form of number, and as numbers, they support a single operation: addition. To add two sandpiles, simply add the number of grains of sand within each cell with the matching cell in the second value:

1 3 0   2 0 2   (1+2) (3+0) (0+2)   3 3 2
1 2 1 + 2 1 0 = (1+2) (2+1) (1+0) = 3 3 1
3 2 2   0 0 1   (3+0) (2+0) (2+1)   3 2 3
Toppling Piles
You probably already have wondered, what happens if the number of grains goes above our max value of 3? The answer is, that pile topples over. If the pile is in the middle, it dumps one grain of sand to each neighbor, keeping whatever is left over. If it's on the edge, it loses one grain to each direct neighbor and also loses one grain for any edges that are on the side, which just disappear. This means that, no matter what, the over-sized cell loses 4 grains of sand, while any neighboring cells gain 1 grain of sand.

This repeats until we've reached a state or equilibrium, like so:

*            *
1 3 0   3 0 2   4 3 2    * 0 5 2      2 1 3      2 1 3
1 2 1 + 2 3 0 = 3 5 1 =>   5 1 2 => * 1 3 2 =>   2 3 2 =>
3 2 2   0 0 1   3 2 3      3 3 3      4 3 3    * 0 4 3
*

*
   2 1 3    2 2 3      2 2 4      2 3 0 *
=> 2 4 2 => 3 0 4   => 3 1 0 * => 3 1 1
   1 0 4    1 2 0 *    1 2 1      1 2 1
*          *
So the final sum looks like this.

1 3 0   3 0 2   2 3 0
1 2 1 + 2 3 0 = 3 1 1
3 2 2   0 0 1   1 2 1
That's a lot of work, and fairly error-prone. (Trust me!)

The Challenge
We want to create a class, Sandpile, that simulates the 3x3, max 3 sandpile. This class should have the following properties:

The constructor optionally takes a string, which is 3 groups of 3 integers (0-9), separated by a newline. If any of the values of the integers are over 3, then immediately topple each pile until the Sandpile is at rest. If no argument is provided, initialize the piles with all zeros.
There should be a toString method, which prints the sandpile the same way as the constructor. This will be used to validate your results.
There should be an add method, which takes another Sandpile as an argument. This method returns a new Sandpile, with the sum of the previous Sandpiles.
Sandpiles are immutable after creation
To let you focus on the fun part of this challenge, you don't have to worry about validation:
The input to the contructor will either be nothing or a string that matches /[0-9]{3}\n[0-9]{3}\n[0-9]{3}/
The add function will only ever receive another Sandpile instance.
Thinking Ahead
While working on this, think about what might be involved in a more generic Sandpile class, which could have a grid of any dimension, or allow for different numbers of grains before toppling over.

If you like this Kata, I'll look at an extended version tackling the dynamic sandpile.*/

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