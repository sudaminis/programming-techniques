package techniques.hashing;

public class MissingNumber {
    public static void main(String...args) {
       // int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        int[] nums = new int[]{3,0,1};
        System.out.println(findMissing(nums));
        System.out.println(findMissingGaussianFormula(nums));
    }

    private static int findMissingGaussianFormula(int[] nums) {
        int range = nums.length;
        int given = ( range * ( range + 1 ) ) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return  given - sum;
    }

    private static int findMissing(int[] nums) {
        boolean[] seen = new boolean[nums.length+1];
        for (int num : nums) {
            seen[num] = true;
        }
        for( int i = 0; i < seen.length; i++) {
            if ( !seen[i]) {
                System.out.println("Missing number is " + i);
                return i;
            }
        }
        return -1;

    }
}
