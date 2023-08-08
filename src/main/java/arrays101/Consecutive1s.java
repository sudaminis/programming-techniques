package arrays101;

/*
Given a binary array, find the maximum number of consecutive 1s in this array.
 */

public class Consecutive1s {
    public static void main(String[] args) {
        int[] nums = new int[] {
           0,0,1,1,1,0,0,1,1,1,1,0
        };
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {

        int currentMax = Integer.MIN_VALUE;
        for( int i = 0; i < nums.length; i++ ) {
            int oneCount = 0;
            while( i < nums.length && nums[i] == 1 ) {
                ++oneCount;
                ++i;
            }
            if( oneCount > currentMax) {
                currentMax = oneCount;
            }
        }

        return currentMax;
    }
}
