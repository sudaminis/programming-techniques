package techniques.hashing;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualToK {
    public static void main(String...args) {
        int[] nums = new int[] {1, 2, 1, 2, 1};
        int k = 3;

        System.out.println(subArraySumEqualToK(nums, k));
    }

    private static int subArraySumEqualToK(int[] nums, int k) {
        int ans = 0;
        int curr = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0,1);

        for( int i = 0; i < nums.length; i++ ) {
            curr += nums[i];
            ans += counts.getOrDefault(curr-k,0);
            counts.put(curr, counts.getOrDefault(curr,0) +1 );
        }

        System.out.println(counts);
        System.out.println(ans);


        return ans;

    }

}
