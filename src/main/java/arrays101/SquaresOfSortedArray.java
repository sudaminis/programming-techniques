package arrays101;
/*
Find squares of a sorted array. Two pointer technique
Compare right and left numbers and then put in target array
 */
public class SquaresOfSortedArray {
    static int[] nums = new int[] {
            -4,-1,0,3,10
    };

    public static void main(String[] args) {
        squaresOfSortedArray(nums);
    }

    private static void squaresOfSortedArray(int[] nums) {
        int[] target = new int[nums.length];
        int last = target.length-1;

        int left = 0;
        int right = nums.length-1;
        while( left < right ) {
            if( Math.abs(nums[left]) < Math.abs(nums[right]) ) {
                target[last--] = nums[right] * nums[right];
                --right;
            } else {
                target[last--] = nums[left] * nums[left];
                ++left;
            }
        }

        for( int n: target) {
            System.out.println(n);
        }
    }


}
