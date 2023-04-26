package techniques.strings;

import java.util.*;

public class MatchingString {
    public static void main(String...args) {
        String[] strings = new String[]{
          "ab'","ab'","abc'"
        };

        String[] queries = new String[]{
           "ab'","abc'","bc'"
        };
        System.out.println(matchingStrings(Arrays.asList(strings), Arrays.asList(queries)));
    }
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        Map<String, Integer> counts = new HashMap<>();
        for (String str : strings) {
            if (counts.containsKey(str)) {
                int val = counts.get(str);
                counts.put(str, val + 1);
            } else {
                counts.put(str, 1);
            }
        }

        List<Integer> r = new ArrayList<>();
        for (String str : queries) {
            r.add(counts.getOrDefault(str, 0));
        }
        return r;
    }
    }
