package demo.namedarguments

/**
 * @ Description：
 * Created by Stone on 7/12/18.
 * @ Time 7/12/18 9:41 PM
 */

fun main(args: Array<String>) {
    var str: String = joinOptions(listOf("yes", "no", "may be"))
    println(str)
}
fun joinOptions(options: Collection<String>) = options.joinToString(prefix = "[", postfix = "]")