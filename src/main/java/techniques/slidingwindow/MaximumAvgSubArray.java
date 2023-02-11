package techniques.slidingwindow;

/*
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has
the maximum average value and return this value
 */
public class MaximumAvgSubArray {

    public static void main(String...args) {
        int[] nums = new int[] {1,12,-5,-6,50,3};
        int k = 4;

        findMaxAvg( nums, k);
    }

    private static void findMaxAvg(int[] nums, int k) {
        double ans;
        double curr_sum = 0;
        double curr_avg;
        for( int i = 0; i < k; i++ ) {
            curr_sum += nums[i];
        }
        ans = curr_sum/k;

        for( int j = k; j < nums.length; j++) {
            curr_sum = curr_sum - nums[j-k] + nums[j];
            curr_avg = curr_sum/k;

            ans = Math.max(ans,curr_avg);
        }

        System.out.println(ans);
    }

}
