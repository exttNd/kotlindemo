package demo.delegatedprooerties

/**
 * @ Description：
 * Created by Stone on 7/9/18.
 * @ Time 7/9/18 8:45 PM
 */
class LazySample() {
    val lazy: String by lazy {
        println("co")
        "my lazy"
    }
}

fun main(args: Array<String>) {
    val sample = LazySample()
    println("lazy = ${sample.lazy}")

    println()
    println("lazy = ${sample.lazy}")
}