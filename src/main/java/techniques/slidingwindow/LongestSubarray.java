package techniques.slidingwindow;

/*
Given an array of positive integers nums and an integer k,
find the length of the longest subarray whose sum is less than or equal to k.
 */

public class LongestSubarray {

    public static void main( String...args) {
        int[] num = new int[] {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int limit = 8;
        System.out.println(longestSubArray(num, limit));
    }

    private static int longestSubArray(int[] num, int limit) {
        int right = 0;
        int curr_sum = 0;
        int window_size = 0;

        for( int left = 0; left < num.length; left++ ) {
            curr_sum += num[left];
            while( curr_sum > limit ) {
                curr_sum -= num[right++];
            }
            window_size = Math.max(window_size, right - left + 1 );
        }
        return window_size;
    }
}
