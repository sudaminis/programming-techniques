package misc;

/*
Calculate the length of longest subarray with sum less than k
 */
public class LongestSubarrayLength {
    public static void main(String[] args) {
        int[] nums = new int[] {
                3, 1, 2, 7, 4, 2, 1, 1, 5
        };
        int limit = 8;
        System.out.println(longestSubarrayLength(nums, limit));
    }

    private static int longestSubarrayLength(int[] nums, int limit) {
        int left = 0;
        int currentSum = 0;
        int currentWindowSize = 0;

        for( int right = 0; right < nums.length; ++right) {
            currentSum += nums[right];
            while( currentSum > limit ) {
                currentSum -= nums[left];
                ++left;
            }
            currentWindowSize = Math.max(currentWindowSize, right - left + 1);
        }
        return currentWindowSize;
    }


}
