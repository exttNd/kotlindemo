package demo.comparison

/**
 * @ Description：
 * Created by Stone on 7/14/18.
 *
 * a > b a.b > 0 当a和b比较，a>b 则比较值大于0
 * a < b a.b < 0
 *
 * a = b a.b = 0
 * @ Time 7/14/18 8:52 PM
 */


data class MyData(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyData> {
    override fun compareTo(other: MyData) = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }



}