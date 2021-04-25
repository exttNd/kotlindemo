package demo.callablereferences

/**
 * @ Description：
 * Created by Stone on 7/9/18.
 * @ Time 7/9/18 9:07 PM
 */
fun isOdd(x: Int): Boolean {
    return x % 2 != 0
}

fun main(args: Array<String>) {
    val number = listOf(1, 2, 3)
    println(number.filter(::isOdd))
}