package demo.basicsyntaxwalkthrough

/**
 * @ Description：
 * Created by Stone on 7/9/18.
 * @ Time 7/9/18 10:42 AM
 */
fun main(args: Array<String>) {
    val x = args[0].toInt()
    val y = 10

    // until 右开
    // .. 右闭
    if (x in 0 until y) {
        println("ok")
    }

    for (a in 1..5) {
        println("$a")
    }

    println()

    for (a in 1 until 5) {
        println("${a}")
    }

    println()

    val array = arrayListOf<String>()
    array.add("aaa")
    array.add("bbb")
    array.add("ccc")


    if (x !in 0 until array.size) {
        println("Out: array has only ${array.size} elements. x = ${x}")
    }

    if ("ddd" in array) {
        println("Yes: array contains ddd")
    } else{
        println("No: array does not contains ddd")
    }

}