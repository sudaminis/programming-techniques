package misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
/*
Given an integer array nums of length n where all the integers of nums are in
the range [1, n] and each integer appears once or twice,
return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.
 */
public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = new int[] {
          4,3,2,7,8,2,3,1
        };
        System.out.println(findDuplicatesBrute(nums));
        System.out.println(findDuplicatesExtraSpace(nums));
        System.out.println(findDuplicatesUseNegation(nums));
    }

    private static List<Integer> findDuplicatesUseNegation(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for( int i = 0; i < nums.length; i++ ) {
            int abs_val = Math.abs(nums[i]);
            nums[abs_val-1] *= -1;
        }

        for( int i = 0; i < nums.length; i++ ) {
            int abs_val = Math.abs(nums[i]);
            if( nums[abs_val-1] > 0 ) {
                ans.add(abs_val);
                nums[abs_val-1] *= -1;
            }
        }
        return ans;
    }

    // extra space - use set
    private static List<Integer> findDuplicatesExtraSpace(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                ans.add(num);
            } else {
                seen.add(num);
            }
        }
        return ans;
    }

    //two loops
    private static List<Integer> findDuplicatesBrute(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for( int i = 0; i < nums.length; i++ ) {
            for( int j = i + 1; j < nums.length; j++) {
                if( nums[i] == nums[j]) {
                    ans.add(nums[i]);
                    break;
                }
            }
        }
        return ans;
    }


}
