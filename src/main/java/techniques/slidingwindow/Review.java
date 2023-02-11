package techniques.slidingwindow;

public class Review {
    public static void main(String...args) {
        int[] nums = new int[]{3, 1, 2, 7, 4, 2, 1, 1, 5};
        int k = 8;

        System.out.println(subArray( nums, k));
    }

    private static int subArray(int[] nums, int k) {
        int left = 0;
        int curr_sum = 0;
        int len = 0;

        for( int right = 0; right < nums.length; ++right) {
            curr_sum += right;
            while( curr_sum > k) {
                curr_sum -= left++;
            }
            len = Math.max(len, right - left +1);
        }
        return len;
    }


}
