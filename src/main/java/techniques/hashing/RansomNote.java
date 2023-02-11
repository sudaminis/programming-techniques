package techniques.hashing;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using
the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
 */
public class RansomNote {
    public static void main(String...args) {
        String ransomNote = "aa";
        String magazine = "ab";

        System.out.println(canConstruct(ransomNote, magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        if( ransomNote.equals(magazine))
            return true;

        if( magazine.length() < ransomNote.length() )
            return false;

        Map<Character, Integer> mag = new HashMap<>();

        for( int i = 0; i < magazine.length();i++) {
            mag.put(magazine.charAt(i), mag.getOrDefault(magazine.charAt(i), 0) +1);
        }
        for( int i = 0; i < ransomNote.length(); i++ ) {
            if( !mag.containsKey(ransomNote.charAt(i)) || ( mag.get(ransomNote.charAt(i)) <= 0 )) {
                return false;
            }
            int temp = mag.get(ransomNote.charAt(i));
            mag.put(ransomNote.charAt(i), temp - 1);
        }
        return true;
    }


}
