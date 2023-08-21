package techniques.strings;

//https://leetcode.com/problems/valid-palindrome/description/
public class Palindrome1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("RADAR"));
    }
        public static boolean isPalindrome(String s) {
            int i = 0;
            int j = s.length() - 1;
            boolean palindrome = true;
            char a; char b;
            while( i < j) {
                a = Character.toLowerCase(s.charAt(i));
                b = Character.toLowerCase(s.charAt(j));

                if( !Character.isLetterOrDigit(a) ) {
                    ++i;
                } else if( !Character.isLetterOrDigit(b)) {
                    --j;
                }
                else if( a != b) {
                    palindrome = false;
                    break;
                } else {
                    ++i;
                    --j;
                }
            }
            return palindrome;
        }
}
