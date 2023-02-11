package techniques.twopointers;
/*
Input: nums = [-4,-1,0,3,10]
[16, 1, 0, 9, 100]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
find solution in o(n)
 */

public class SquaresOfSortedArray {
    public static void main( String...args) {
        int[] nums = new int[] {-4,-1,0,3,10};
        squareOfSortedArray(nums);
    }

    private static void squareOfSortedArray(int[] nums) {
        int n = nums.length;
        int right = 0;
        int left = nums.length-1;
        int[] sorted = new int[n];

        while( right <= left ) {
            int first = Math.abs(nums[right]);
            int second = Math.abs(nums[left]);

            if( first  < second ) {
                sorted[--n] = second * second;
                --left;
            } else {
                sorted[--n] = first * first;
                ++right;
            }
        }

        for( int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }

    }

}
