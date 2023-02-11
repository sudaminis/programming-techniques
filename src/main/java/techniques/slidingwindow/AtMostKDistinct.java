package techniques.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/*
 You are given a string s and an integer k.
 Find the length of the longest substring that contains at most k distinct characters.
 */
public class AtMostKDistinct {
    public static void main(String...args) {
        String s = "eceba";
        int limit = 2;

        System.out.println(findStringWithAtMostKDistinct(limit, s.toCharArray()));

    }

    private static int findStringWithAtMostKDistinct(int limit, char[] chars) {
        Map<Character, Integer> characters_count = new HashMap<>();
        int left = 0;
        int window_size = 0;
        int right_char_count = 0;
        int left_char_count = 0;
        char right_char;
        char left_char;
        for( int right = 0; right < chars.length; ++right) {
            right_char = chars[right];
            right_char_count = characters_count.getOrDefault(right_char, 0);
            characters_count.put(right_char, ++right_char_count);

            while( characters_count.size() > limit ) {
                left_char = chars[left];
                left_char_count = characters_count.getOrDefault(left_char, 0);
                characters_count.put(left_char, --left_char_count);
                if( left_char_count == 0) {
                    characters_count.remove(left_char);
                }
                ++left;
            }
            window_size = Math.max(window_size, right - left +1);
        }
        return window_size;
    }

}
