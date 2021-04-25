package demo.basicsyntaxwalkthrough

/**
 * @ Description：
 * Created by Stone on 7/9/18.
 * @ Time 7/9/18 1:26 PM
 */
fun main(args: Array<String>) {

    case(1)
    case("sh")
    case(My())
}

fun case(obj: Any) {
    when (obj) {
        1 -> {
            println("1")
        }
        is String -> {
            println("is string")
        }

        else -> {
            println("unknown")
        }
    }
}

class My() {}
