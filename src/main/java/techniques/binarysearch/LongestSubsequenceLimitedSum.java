package techniques.binarysearch;

import java.util.Arrays;

public class LongestSubsequenceLimitedSum {
    public static void main(String...args) {
        int[] nums = new int[]{4,5,2,1};
        int[] queries = new int[] {3,10,21};

        int[] ans = longestSubsequence( nums, queries);
        for( Integer i: ans ) {
            System.out.println(i);
        }
    }

    private static int[] longestSubsequence(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] ans = new int[queries.length];
        for( int i = 0; i < queries.length; i++) {
            int count = 0;
            int sum = 0;
            int j = 0;
            while ( j < nums.length && sum <= queries[i]) {
                ++count;
                sum += nums[j++];
                System.out.println("Count = " + count);
                System.out.println("Sum = " +sum);
            }
            if( sum > queries[i]) {
                --count;
            }
            ans[i] = count;
        }
        return ans;
    }


}
