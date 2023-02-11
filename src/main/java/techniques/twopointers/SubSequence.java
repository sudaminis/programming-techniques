package techniques.twopointers;

/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting
some (can be none) of the characters without disturbing the relative positions of the remaining
characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */

public class SubSequence {
    public static void main( String...args) {
        String big = "abcde";
        String small = "adc";
        System.out.println(isSubSequence(big,small));
    }

    private static boolean isSubSequence(String big, String small) {
        int i = 0, j = 0;

        while( i < big.length()) {
            if( small.charAt(j) == big.charAt(i)) {
                ++i;
                ++j;
            } else {
                ++i;
            }
        }

        if( j == small.length()) {
            return true;
        }

        return false;
    }
}

