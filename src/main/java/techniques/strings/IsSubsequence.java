package techniques.strings;
//https://leetcode.com/problems/is-subsequence/

public class IsSubsequence {
    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));

    }
        public static boolean isSubsequence(String s, String t) {
            String big = t;
            String small = s;

            int big_i = 0;
            int small_j = 0;

            while( big_i < big.length() && small_j < small.length() ) {
                if( big.charAt(big_i) == small.charAt(small_j) ) {
                    ++small_j;
                }
                ++big_i;
            }

            System.out.println(small_j);

            return small_j == small.length();

        }
}
