package techniques.slidingwindow;

/*
 Given an integer array nums and an integer k,
 find the sum of the subarray with the largest sum whose length is k.
 */

public class FixedWindow {
    public static void main(String...args) {
        int[] nums = new int[] {-3,-1,-4,-12,-8,-5,-6};
        int k = 4;

        findMaxSumWithFixedWidth(nums, k);
    }

    private static void findMaxSumWithFixedWidth(int[] nums, int k) {
        int ans = 0;
        int curr_sum = 0;

        for( int i = 0; i < k; i++ ) {
            curr_sum += nums[i];
        }
        ans = curr_sum;

        for( int j = k; j < nums.length; j++) {
            curr_sum = curr_sum - nums[j-k] + nums[j];
            if( curr_sum > ans) {
                ans = curr_sum;
            }
        }
        System.out.println("Largest sum of fixed width = " + ans);
    }


}
