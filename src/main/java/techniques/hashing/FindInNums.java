package techniques.hashing;
/*
Given an integer array nums, find all the numbers x that satisfy the following:
x + 1 is not in nums, and x - 1 is not in nums.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindInNums {
    public static void main(String...args) {
        int[] nums = new int[] { 2,8,11,10,12,13};
        System.out.println(findNumbers(nums));
    }
    public static List<Integer> findNumbers(int[] nums) {
       List<Integer> ans = new ArrayList<>();
       Set<Integer> numsSet = new HashSet<>();
       for( int i = 0; i < nums.length; i++ ) {
           numsSet.add(nums[i]);
       }

       for( Integer i : numsSet) {
           if( !numsSet.contains(i+1) && !numsSet.contains(i-1)) {
               ans.add(i);
           }
       }
        return ans;
    }

}
