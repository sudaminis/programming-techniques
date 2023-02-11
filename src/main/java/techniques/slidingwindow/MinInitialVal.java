package techniques.slidingwindow;

public class MinInitialVal {
    public static void main(String... args) {
        int ans;
        int init = 0;
        int curr;
        boolean found = false;
        int[] nums = new int[]{-3, 2, -3, 4, 2};
        while (true) {
            if( found ) {
                ans = init;
                break;
            } else {
                ++init;
                curr = init + nums[0];
                if( curr < 1 ) {
                    continue;
                }
                int index = 1;
                while (index++ < nums.length) {
                    curr = curr + nums[index];
                    if (curr < 1) {
                        break;
                    }
                }
                if( index == nums.length ) {
                    found = true;
                }
            }
        }
        System.out.println( "Ans = " + ans);
    }
}
