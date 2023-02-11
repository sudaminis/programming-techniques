package techniques.hashing;

import java.util.*;
import java.util.stream.Collectors;

public class CountOccurrences {
    public static void main(String...args) {
        String s = "abacbc";
        System.out.println("are same? " + countOccurrences(s));
    }

    private static boolean countOccurrences(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> counts = new HashMap<>();
        Set<Integer> val;

        for( int i = 0; i < chars.length; i++ ) {
            char temp = chars[i];
            counts.put(temp, counts.getOrDefault(temp, 0) + 1);
        }

        System.out.println(counts);

        val = counts.values().stream().collect(Collectors.toSet());

        if( val.size() == 1) {
            return true;
        }
        return false;
    }

}
