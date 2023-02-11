package techniques.hashing;

import java.util.*;

public class IsSentencePangram {
    public static void main(String...args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        //String sentence = "leetcode";
        System.out.println(isPangramBrute(sentence));
        System.out.println(isPangramUsingCharTrick(sentence));
        System.out.println(isPangramUsingHashSet(sentence));
        System.out.println(isPangramUsingArrayAsCounter(sentence));
    }

    private static boolean isPangramUsingArrayAsCounter(String sentence) {
        boolean[] seen = new boolean[26];
        char[] arr = sentence.toCharArray();
        for( char c: arr ) {
            seen[c - 'a'] = true;
        }
        for( boolean val: seen) {
            if(!val) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPangramUsingHashSet(String sentence) {
        Set<Character> seen = new HashSet<>();
        for( int i = 0; i < sentence.length(); i++) {
            seen.add(sentence.charAt(i));
        }
        if( seen.size() == 26) {
            return true;
        }
        return false;
    }

    /*
    ascii value of 'a' is 97. so 97 + 0 = 97 converted to char is 'a'. 97 + 1 = 98 is 'b' and so on.
     */
    private static boolean isPangramUsingCharTrick(String sentence) {
        for( int i = 0; i < 26; i++) {
            char c = (char) ( i + 'a' );
            if( sentence.indexOf( c ) < 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPangramBrute(String sentence) {
        Set<String> allAlphabets = new HashSet<>();
        allAlphabets.addAll(Arrays.asList("a","b","c", "d", "e","f", "g", "h", "i", "j", "k","l","m",
           "n","o","p","q","r","s","t","u","v","w","x", "y", "z"));
        Map<String, Integer> counts = new HashMap<>();

        for( int i = 0; i < sentence.length(); i++) {
            counts.put(String.valueOf(sentence.charAt(i)), counts.getOrDefault(String.valueOf(sentence.charAt(i)), 0 + 1));
            //counts.computeIfPresent(String.valueOf(sentence.charAt(i)), (key,val)-> val + 1);
        }
        System.out.println(counts);
        if( counts.keySet().containsAll(allAlphabets) ) {
            return true;
        }

        return false;
    }


}
