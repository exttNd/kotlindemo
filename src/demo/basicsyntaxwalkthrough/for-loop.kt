package demo.basicsyntaxwalkthrough

/**
 * @ Description：
 * Created by Stone on 7/9/18.
 * @ Time 7/9/18 10:09 AM
 */
fun main(args: Array<String>) {
    for (arg in args) {
        println(arg)
    }

    println()

    for (i in args.indices) {
        println(args[i])
    }
}