package techniques.hashing;

import java.util.*;

/*
Given an array of strings strs, group the anagrams together.

For example, given strs = ["eat","tea","tan","ate","nat","bat"],
return [["bat"],["nat","tan"],["ate","eat","tea"]].
 */
public class GroupAnagrams {

    public static void main(String...args) {
        String[] strArray = new String[] {
         "eat","tea","tan","ate","nat","bat"
        };

        System.out.println( groupAnagrams(strArray) );
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for( String str: strs ) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String strSorted = String.valueOf(chars);

            List<String> temp = anagrams.getOrDefault(strSorted, new ArrayList<>());
            temp.add(str);
            anagrams.put(strSorted, temp);
        }
        return new ArrayList<>(anagrams.values());
    }

}
