package techniques.arrays;

import java.util.HashSet;
import java.util.Set;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class SingleNum {

    public static void main(String...args) {
        int[] nums = new int[] {
           4,1,2,1,2
        };
        System.out.println(findSingleMath(nums));
        System.out.println(findSingleXOR(nums));
    }

    private static int findSingleXOR(int[] nums) {
        int a = 0;
        // XOR of num and 0 = num
        // XOR of num and num = 0
        for (int i : nums) {
            System.out.println("Before = " +a);
            a ^= i;
            System.out.println("After = " +a);
        }
        return a;
    }

    private static int findSingleMath(int[] nums) {
        int setSum = 0;
        int arrSum = 0;

        Set<Integer> setOfNums = new HashSet<>();

        for (int num : nums) {

            if (setOfNums.add(num)) {
                setSum += num;
            }
            arrSum += num;
        }

        return 2 * setSum - arrSum;

    }



}
