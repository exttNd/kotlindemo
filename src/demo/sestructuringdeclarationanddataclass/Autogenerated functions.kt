package demo.sestructuringdeclarationanddataclass

/**
 * @ Description：
 * Created by Stone on 7/9/18.
 * @ Time 7/9/18 7:24 PM
 */
fun main(args: Array<String>) {
    val user = User("Stone", 1)

   // println("name:${user.name}")
    println(user)

    val secondUser = User("Stone2", 3)
    val threeUser = User("stone3", 4)
    println("name:${secondUser.name}")
    println("name3:${threeUser.name}")

    println(user.copy())
    println(user.copy(name = "Max"))
    println(user.copy(id = 1))
    println(user.copy("haha", 3))
}

