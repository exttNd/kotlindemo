package demo.sestructuringdeclarationanddataclass

/**
 * @ Description：
 * Created by Stone on 7/9/18.
 * @ Time 7/9/18 5:32 PM
 */
fun main(args: Array<String>) {

    val map = hashMapOf<String, String>()
    map["one"] = "1"
    map["two"] = "2"
    map["three"] = "3"

    for ((key, value) in map) {
        println("key:$key, value：$value")
    }
}