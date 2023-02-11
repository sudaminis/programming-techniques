package techniques.hashing;

import java.util.*;

public class LargestUniqueNumber {
    public static void main(String...args) {
        //int[] nums = new int[] {5,7,3,9,4,9,8,3,1};
        int[] nums = new int[] { 8,9,8,9};
        System.out.println(findLargestUsingHashMap(nums));
        System.out.println(findLargestUsingSorting(nums));
    }

    private static int findLargestUsingSorting(int[] nums) {
        Arrays.sort(nums);

        for( int i = nums.length-1; i>=0; i--) {
            if( i == 0 || nums[i] != nums[i-1]) {
                return nums[i];
            }
            while( i > 0 && nums[i] == nums[i-1]) {
                i--;
            }
        }
        return -1;
    }

    private static int findLargestUsingHashMap(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        int ans = -1;

        for (Map.Entry<Integer, Integer> kv : count.entrySet()) {
            if (kv.getValue() == 1) {
                Integer key = kv.getKey();
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }

}
