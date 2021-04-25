package demo.basicsyntaxwalkthrough

/**
 * @ Description：
 * Created by Stone on 7/9/18.
 * @ Time 7/9/18 9:45 AM
 */
fun main(args: Array<String>) {

    if (args.size < 2) {
        println("no match number")
        return
    }

    val x = parseInt(args[0])
    val y = parseInt(args[1])

    if (x != null && y != null) {
        println(x * y)
        return
    }

    println("one of number is null")
}

fun parseInt(s: String): Int? {

    try {
        return s.toInt()
    } catch (e: NumberFormatException) {
        println("One of the arguments isn't Int")
    }

    return null
}