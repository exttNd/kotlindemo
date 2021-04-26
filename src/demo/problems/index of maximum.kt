package demo.problems

/**
 * @ Description：
 * Created by Stone on 7/10/18.
 * @ Time 7/10/18 8:56 AM
 *
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
*/

fun indexOfMax(a: IntArray): Int? {

    if(a == null) {
        return null
    }

    if (a.isEmpty()) {
        return null
    }

    var indexOfMax: Int = 0
    for (b in a.indices) {
        val newElem = a[b]
        if (newElem >= a[indexOfMax]){
            indexOfMax = b;
        }
    }

    return indexOfMax
}
