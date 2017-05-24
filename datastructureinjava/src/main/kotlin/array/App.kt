package array

/**
 * Created by sekou_diarra on 23/05/17.
 */
//class App {
//
//
//}

fun main(args: Array<String>) {

    var nums = emptyArray<Int>()

    for ((i, el) in nums.iterator().withIndex()) {
        nums.set(i, 2 * i)
    }

    //O(1) "Constant time" complexity random index;
    val num: Int = nums[0];
    print(num)

    //O(N) "Linear search" ---> O(logN) binary trees ---> O(1) hashtables
    for((i,el) in (1 .. nums.size).withIndex()){
        if(nums[i] == 4)
            print("Index found, " + i)
    }
}