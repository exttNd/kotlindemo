package demo.problems

/**
 * @ Description：
 * Created by Stone on 7/10/18.
 * @ Time 7/10/18 8:55 AM
 *
 *
 * Your task is to implement the sum() function so that it computes the sum of
 * all elements in the given array a.
 */

fun sum(a: IntArray): Int {
    // Write your solution here
    var sum = 0;
    for(b in a){
        sum += b
    }
    return sum
}