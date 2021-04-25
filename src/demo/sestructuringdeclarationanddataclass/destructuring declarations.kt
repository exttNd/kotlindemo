package demo.sestructuringdeclarationanddataclass

/**
 * @ Description：
 * Created by Stone on 7/9/18.
 * @ Time 7/9/18 1:36 PM
 */
fun main(args: Array<String>) {
    val pair = Pair(1, "one")
    val (num, name) = pair
    println("name:$name, num:$num")
}

class Pair<K, T>(val first: K, val second: T) {
    operator fun component1(): K {
        return first
    }

    operator fun component2(): T {
        return second
    }

}