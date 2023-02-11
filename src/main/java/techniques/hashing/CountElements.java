package techniques.hashing;

import java.util.HashSet;
import java.util.Set;

/*
Given an integer array arr, count how many elements x there are,
such that x + 1 is also in arr.
If there are duplicates in arr, count them separately.
 */
public class CountElements {
    public static void main(String...args) {
        //int nums[] = new int[] {1,1,3,3,5,5,7,7};
        int[] nums = new int[] {1,2,3};
        //int nums[] = new int[] {-1,2,3};

        System.out.println( countElements(nums) );
    }

    private static int countElements(int[] arr) {
        Set<Integer> unique = new HashSet<>();
        for (int j : arr) {
            unique.add(j);
        }
        int count = 0;
        for (int j : arr) {
            if (unique.contains(j + 1)) {
                count += 1;
            }
        }
        return count;
    }
}
