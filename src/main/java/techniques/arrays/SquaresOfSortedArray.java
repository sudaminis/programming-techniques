package techniques.arrays;

//https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4689/

public class SquaresOfSortedArray {

    public static void main(String[] args) {
        int[] num = new int[]{
                -4, -1, 0, 3, 10
        };
        squares(num);
    }

    private static void squares(int[] nums) {
        int[] target = new int[nums.length];
        int left = 0;
        int right = target.length - 1;

        for (int i = target.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                target[i] = nums[right] * nums[right];
                --right;
            } else {
                target[i] = nums[left] * nums[left];
                ++left;
            }
        }
    }

}

