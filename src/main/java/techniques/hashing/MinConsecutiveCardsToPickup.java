package techniques.hashing;

/*
Minimum Consecutive Cards to Pick Up

Given an integer array cards, find the length of the shortest subarray that contains
at least one duplicate. If the array has no duplicates, return -1.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinConsecutiveCardsToPickup {
    public static void main(String...args) {
        int[] nums = new int[] {3,4,2,3,4,7};

        //int[] nums = new int[] {2,2,2,2};
        //int[] nums = new int[] {1,2,3,4};
        findMinConsecutiveCardsToPickupBruteForce(nums);
        System.out.println( findMinConsecutiveCardsToPickupOptimized(nums) );
    }

    private static int findMinConsecutiveCardsToPickupOptimized(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        int min = Integer.MAX_VALUE;

        for( int i = 0; i < nums.length; i++) {
            int temp = counts.getOrDefault(nums[i], 0);
            min = Math.min(min, i - temp + 1);

            counts.put(nums[i], i);
        }

        System.out.println(counts);


        if( min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    private static int findMinConsecutiveCardsToPickupBruteForce(int[] nums) {

        Map<Integer, List<Integer>> counts = new HashMap<>();

        for( int i = 0; i < nums.length; i++) {
            List<Integer> temp = counts.getOrDefault(nums[i], new ArrayList<>());

            temp.add(i);

            counts.put(nums[i], temp);
        }

        int max = Integer.MAX_VALUE;
        int ans = -1;

        for( List<Integer> list : counts.values()) {
            for( int i = 0; i < list.size()-1; i++ ) {
                max = Math.min(max, list.get(i+1) - list.get(i) + 1);
            }
        }

        if( max == Integer.MAX_VALUE) {
            ans = -1;
        } else {
            ans = max;
        }
        System.out.println(counts);
        System.out.println(ans);



        return ans;

    }


}
