package demo.basicsyntaxwalkthrough

/**
 * @ Description：
 * Created by Stone on 7/9/18.
 * @ Time 7/9/18 9:54 AM
 */
fun main(args: Array<String>) {

    println(getStringLength("stone hello"))
    println(getStringLength(1))
}

fun getStringLength(obj: Any): Int? {

    if (obj is String) {
        return obj.length
    }
    return null

}
