package demo.extensionfuntions

/**
 * @ Description：
 * Created by Stone on 7/10/18.
 * @ Time 7/10/18 10:30 PM
 */
fun main(args: Array<String>) {
    /*var a: Int = 0
    a.r()*/

    var p = Pair(2,2)
    p.r()
}


fun Int.r(): RationalNumber {
    return RationalNumber(this, 2)
}

fun Pair<Int, Int>.r(): RationalNumber {
    return RationalNumber(first, second)
}
data class RationalNumber(val numerator: Int, val denominator: Int)

fun getList(): List<Int> {
    return arrayListOf(1, 5, 2).sortedDescending()//TODO("return the list sorted in descending order")
}

