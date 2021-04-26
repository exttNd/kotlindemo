package demo.problems

/**
 * @ Description：
 * Created by Stone on 7/10/18.
 * @ Time 7/10/18 9:10 AM
 */
class javaCode {

    fun toJSON(collection: Collection<Int>): String {
        val sb = StringBuilder()
        sb.append("[")
        val iterator = collection.iterator()
        while (iterator.hasNext()) {
            val element = iterator.next()
            sb.append(element)
            if (iterator.hasNext()) {
                sb.append(", ")
            }
        }
        sb.append("]")
        return sb.toString()
    }

}
