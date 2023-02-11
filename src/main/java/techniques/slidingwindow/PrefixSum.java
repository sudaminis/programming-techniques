package techniques.slidingwindow;

public class PrefixSum {

    public static void main( String...args) {
        int[] nums = new int[] {5, 2, 1, 6, 3, 8};
        prefix(nums);
    }

    private static void prefix(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for( int i = 1; i < nums.length; ++i) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        for( int i = 0; i < prefixSum.length; i++) {
            System.out.println(prefixSum[i]);
        }
    }
}
