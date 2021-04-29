package demo.lambdas

/**
 * @ Description：
 * Created by Stone on 7/13/18.
 * @ Time 7/13/18 8:22 AM
 */

fun main(args: Array<String>) {
    val text = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
    println(text)
}
fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }