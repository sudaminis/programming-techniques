package techniques.slidingwindow;

/*
You are given a binary substring s (a string containing only "0" and "1").
An operation involves flipping a "0" into a "1". What is the length of the longest substring
containing only "1" after performing at most one operation?

For example, given s = "1101100111", the answer is 5.
If you perform the operation at index 2, the string becomes 1111100111.
 */

public class BinarySubString {
    public static void main( String...args) {
        //String s = "1101100111";
        String s = "";
        findLongest( s );
    }

    private static void findLongest(String s) {
        int left = 0;
        int curr_len = 0;
        int count = 0;
        char[] chars = s.toCharArray();

        for( int right = 0; right < chars.length; right++ ) {
            if( chars[right] == '0') {
                count++;
            }
            while( count > 1) {
                curr_len -= left++;
                if( chars[left] == '0') {
                    --count;
                }
            }

            curr_len = Math.max(curr_len, right - left + 1);
        }
        System.out.println(curr_len);
    }


}
