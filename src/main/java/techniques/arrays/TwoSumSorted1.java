package techniques.arrays;

import java.util.Arrays;

public class TwoSumSorted1 {

    public static void main(String[] args) {
        int[] numbers = new int[] { 2,7,11,15};
        int target = 9;
        int[] ans = twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int currentSum;
        int[] ans = null;
        while ( i < j ) {
            currentSum = numbers[i] + numbers[j];
            if( currentSum == target ) {
                ans = new int[] {i+1,j+1};
                break;
            }
            if ( currentSum < target ) {
                ++i;
            } else {
                --j;
            }
        }
        return ans;

    }
}
