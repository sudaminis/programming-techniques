package misc;


public class LongestSubstringLength {
    public static void main(String[] args) {
        String s = "1101100111";
        System.out.println(longestSubstringLength(s));
    }

    private static int longestSubstringLength(String s) {
        int left = 0;
        int currentLength = 0;
        int countOnes = 0;
        for( int right = 0; right < s.length(); ++right ) {
            if( s.charAt(right) == '0') {
                ++countOnes;
            }
            while( countOnes > 1) {
                if( s.charAt(left) == '0') {
                    --countOnes;
                }
                ++left;
            }

            currentLength = Math.max(currentLength, right - left + 1);
        }
        return currentLength;
    }

}
