package misc;

public class IsStringPalindrome {
    public static void main(String[] args) {
        String s = ""; //level
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;

        while( i < j ) {
            if( chars[i] != chars[j]) {
                return false;
            } else {
                ++i;
                --j;
            }
        }
        return true;


    }


}
