package techniques.hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String...args) {
        int[] nums = new int[] {2,8,11,3,1,5};
        int target = 11;

        bruteTwoSum(nums, target);
        hashMapTwoSum( nums, target);
    }

    private static void hashMapTwoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
       int search;
       for( int i = 0; i < nums.length; i++ ) {
           search = target - nums[i];
           if( map.containsKey(search)) {
               System.out.println("Found " + i + ", " + map.get(search) );
               break;
           }
           map.put(nums[i], i );
       }
    }

    private static void bruteTwoSum(int[] nums, int target) {
        for( int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int second = target - first;
            for( int j = 0; j < nums.length; j++) {
                if( i == j ) {
                    continue;
                }
                if( nums[j] == second ) {
                    System.out.println( "Found " + i + ", " + j );
                    return;
                }
            }
        }
        System.out.println( "Not found");
    }


}
