package demo.sestructuringdeclarationanddataclass

/**
 * @ Description：
 * Created by Stone on 7/9/18.
 * @ Time 7/9/18 1:42 PM
 */
fun main(args: Array<String>) {

    val usr = getUser()
    println("name:${usr.name}")

    val (name, id) = getUser()
    println("name: $name")

    println("name = ${getUser().component1()}")
}

data class User(val name: String, val id: Int)

fun getUser(): User {
    return User("Stone", 77)
}