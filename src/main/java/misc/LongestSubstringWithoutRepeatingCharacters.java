package misc;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s =  "abcc";//"abcabcbb";
        System.out.println(longestSubstringLength(s));
    }

    private static int longestSubstringLength(String s) {
        int left = 0;
        int currentLength = 0;

        Map<Character, Integer> frequencyMap = new HashMap<>();

        //abcabcbb
        for( int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            int  rightCharFrequency = frequencyMap.getOrDefault(rightChar, 0);
            frequencyMap.put(rightChar, rightCharFrequency + 1 );
            if( frequencyMap.get(rightChar) > 1 ) {
                char leftChar = s.charAt(left);
                int leftCharFreq = frequencyMap.get(leftChar);
                frequencyMap.put(leftChar, leftCharFreq - 1);
                ++left;
            }
            currentLength = Math.max(currentLength, right - left + 1);
        }

        return currentLength;
    }



}
