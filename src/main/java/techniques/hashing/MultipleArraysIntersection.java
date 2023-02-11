package techniques.hashing;

import java.util.*;

/*
Given a 2D array nums that contains n arrays of distinct integers,
return a sorted array containing all the numbers that appear in all n arrays.


For example, given nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]], return [3, 4]. 3 and 4 are the only numbers that are in all arrays.
 */
public class MultipleArraysIntersection {
    public static void main(String...args) {

        int[][] nums = new int[][]{
                {3, 1, 2, 4, 5},
                {1,2,3,4},
                {3,4,5,6}
        };

        System.out.println(getArrayIntersection(nums));

    }

    private static List getArrayIntersection(int[][] nums) {
        Map<Integer,Integer> counts = new HashMap<>();
        for( int i =0; i < nums.length; i++) {
            int[] arr = nums[i];
            for( int j = 0; j < arr.length; j++) {
                // counts.put(x, counts.getOrDefault(x, 0) + 1);
                counts.put(arr[j], counts.getOrDefault(arr[j], 0));
            }
        }
        int limit = nums.length;
        List<Integer> answer = new ArrayList<>();
        Set<Integer> keys = counts.keySet();
        for( Integer i: keys) {
            if( i == limit ) {
                answer.add(i);
            }
        }
        return answer;
    }
}
