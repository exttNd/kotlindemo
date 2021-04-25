package demo.delegatedprooerties

import kotlin.reflect.KProperty

/**
 * @ Description：
 * Created by Stone on 7/9/18.
 * @ Time 7/9/18 7:59 PM
 */
fun main(args: Array<String>) {

    val e = Example()
    println(e.p)
    e.p = "en"
}

class Example{
    var p: String by Delegate()

}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "dd"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {

        println("ssss")
    }


}
