package techniques.arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[] nums = new int[] {
                1, 2, 4, 6, 8, 9, 14, 15
        };

        int target = 13;

        System.out.println(twoSumSorted(nums, target));
    }

    private static boolean twoSumSorted( int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        int currentSum;
        while ( i < j ) {
            currentSum = nums[i] + nums[j];
            if( currentSum == target ) {
                return true;
            }
            if ( currentSum < target ) {
                ++i;
            } else {
                --j;
            }
        }
        return false;
    }


}
