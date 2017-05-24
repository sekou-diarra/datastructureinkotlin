package Arrays;

/**
 * Created by sekou_diarra on 23/05/17.
 */
public class App {
    public static void main(String[] args) {

        int[] nums = new int[5];

        for (int i = 1; i < nums.length; ++i)
            nums[i] = 2 * i;

        //O(1) "Constant time" complexity random index;
        int num = nums[0];
        System.out.println(num);

        //O(N) "Linear search" ---> O(logN) binary trees ---> O(1) hashtables
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 4)
                System.out.println("Index found, " + i);

    }
}
