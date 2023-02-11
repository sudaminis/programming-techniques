package techniques.slidingwindow;

public class MaxConsecutiveOnes {

    public static void main(String...args) {
        int[] nums =  new int[]{1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        //int[] nums = new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        //int k = 3;
        System.out.println( longestOnes(nums,k) );
    }

    public static int longestOnes(int[] nums, int k) {
        int left = 0, right;
        for (right = 0; right < nums.length; right++) {
            // If we included a zero in the window we reduce the value of k.
            // Since k is the maximum zeros allowed in a window.
            if (nums[right] == 0) {
                k--;
            }
            // A negative k denotes we have consumed all allowed flips and window has
            // more than allowed zeros, thus increment left pointer by 1 to keep the window size same.
            if (k < 0) {
                // If the left element to be thrown out is zero we increase k.
                if( nums[left] == 0) {
                    k++;
                }
                k = k + 1 - nums[left];
                left++;
            }
        }
        return right - left;
    }

}
