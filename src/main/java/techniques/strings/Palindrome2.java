package techniques.strings;

public class Palindrome2 {
    public static void main(String[] args) {
        String s = "RADAR";

        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while( i < j) {
            if( s.charAt(i) != s.charAt(j)) {
                return ( checkPalindrome(s, i+1, j) || checkPalindrome(s, i, j-1));
            }
            ++i;
            --j;
        }

        return true;
    }

    private static boolean checkPalindrome(String s, int i, int j) {
        while( i < j) {
            if( s.charAt(i) < s.charAt(j)) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }


}
