package arrays101;

/*
Find Numbers with Even Number of Digits
 */

public class NumsWithEvenDigits {
    static int[] nums = new int[] {
     12, 345, 2, 6, 7896
    };
    public static void main(String[] args) {
        System.out.println(findEven(nums));
    }

    private static int findEven(int[] nums) {
        int evenCount = 0;

        for (int num : nums) {
            int val = num;
            int div;
            int digitCount = 0;
            while (true) {
                div = val / 10;
                ++digitCount;
                if (div == 0) {
                    break;
                } else {
                    val = div;
                }
            }
            if (digitCount % 2 == 0) {
                ++evenCount;
            }
        }
        return evenCount;
    }

}
