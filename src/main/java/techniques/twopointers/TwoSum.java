package techniques.twopointers;

/**
 * Given a sorted array of unique integers and a target integer, return true if there exists
 * a pair of numbers that sum to target, false otherwise. This problem is similar to Two Sum.
 *
 * For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.
 */
public class TwoSum {
    public static void main(String...args) {
        int[] nums = new int[]{-9,1,2,4,6,8,14,15};
        int target = 5;

        System.out.println(isTargetAvailable(nums, target));
    }

    private static boolean isTargetAvailable(int[] nums, int target) {
        if( nums.length == 0 ) {
            System.out.println("Empty array. Returning false");
            return false;
        }
        int right = 0, left = nums.length-1;
        int sum;
        while( right < left ) {
            sum = nums[right] + nums[left];
            if( sum == target ) {
                System.out.println("1st = " + nums[right] + " second = " + nums[left]);
                return true;
            } else if ( sum < target ) {
                ++right;
            } else {
                --left;
            }
        }

        return false;
    }
}
