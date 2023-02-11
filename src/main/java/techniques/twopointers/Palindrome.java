package techniques.twopointers;

import java.util.Objects;

public class Palindrome {
    public static void main( String...args){
        String str = "racecar";
        Objects.requireNonNull(str);
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length()-1;
        while( left < right ) {
            if( str.charAt(left) != str.charAt(right)) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }
}
