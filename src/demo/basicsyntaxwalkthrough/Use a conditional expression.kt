package demo.basicsyntaxwalkthrough

/**
 * @ Description：
 * Created by Stone on 7/9/18.
 * @ Time 7/9/18 9:35 AM
 */
fun main(args: Array<String>) {
    println(max(2, 4))
}

fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}