package demo.extensionfunctions

import org.junit.Assert
import org.junit.Test
import java.util.*

/**
 * @ Description：
 * Created by Stone on 7/14/18.
 * @ Time 7/14/18 7:54 PM
 */
data class RationalNumber(val numerator: Int, val denominator: Int)

fun Int.r(): RationalNumber = RationalNumber(this, 1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(4, 1)
fun main(args: Array<String>) {
    println(4.r() === RationalNumber(4, 1))
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y - x })
}




