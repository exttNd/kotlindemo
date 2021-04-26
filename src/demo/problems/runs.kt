package demo.problems

/**
 * @ Description：
 * Created by Stone on 7/10/18.
 * @ Time 7/10/18 8:56 AM

 * Any array may be viewed as a number of "runs" of equal numbers.
 * For example, the following array has two runs:
 *   1, 1, 1, 2, 2
 * Three 1's in a row form the first run, and two 2's form the second.
 * This array has two runs of length one:
 *   3, 4
 * And this one has five runs:
 *   1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0
 * Your task is to implement the runs() function so that it returns the number
 * of runs in the given array.
*/

fun runs(a: IntArray): Int {
    // Write your solution here

    var index: Int = 0
    var count: Int = 0

    if (count == a.size) {
        return count
    }
    for (b in a.indices) {
        val newElem = a[b]
        if (newElem != a[index]) {
            index = b
            count++
        }

    }

    return ++count
}