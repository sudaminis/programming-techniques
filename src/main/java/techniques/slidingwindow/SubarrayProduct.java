package techniques.slidingwindow;
/*
For example, given the input nums = [10, 5, 2, 6], k = 100, the answer is 8.
The subarrays with products less than k are:

[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
 */

public class SubarrayProduct {
    public static void main( String...args) {
        int[] nums = new int[] {10, 1, 2, 6};
        int limit = 1;

        findSubarrays(nums, limit);
    }

    private static int findSubarrays(int[] nums, int limit) {

        int ans = 0;
        int left = 0;
        int curr = 1;

        for (int right = 0; right < nums.length; right++) {
            curr *= nums[right];
            while (left <= right && curr >= limit) {
                curr /= nums[left];
                left++;
            }
            ans += right - left + 1;
        }

        System.out.println("Number of subarrays with a given constraint = " +ans);
        return ans;

    }

}
