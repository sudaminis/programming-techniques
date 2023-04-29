package techniques.strings;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {
    private static final String PANGRAM = "pangram";
    private static final String NOT_PANGRAM = "not pangram";

    public static void main(String...args) {
        String s = " We promptly judged antique ivory buckles for the next prize";
        System.out.println(pangrams(s.toLowerCase()));
    }
    public static String pangrams(String s) {
        // Write your code here
        Set<Character> ALL_LETTERS = new HashSet<>(Set.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));

        if( s.length() < 26 ) {
            return NOT_PANGRAM;
        }

        for( int i = 0; i < s.length(); i++) {
            boolean removed = ALL_LETTERS.remove(s.charAt(i));
            System.out.println("Is removed " + removed);
        }

        if( ALL_LETTERS.size() == 0 ) {
            return PANGRAM;
        } else {
            return NOT_PANGRAM;
        }
    }
}
