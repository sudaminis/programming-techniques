package techniques.hashing;
/*
Given a string s, return the first character to appear twice.
It is guaranteed that the input will have a duplicate character.
 */

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateLetter {
    public static void main( String...args) {
        String s = "Ihaveduplicute";

        System.out.println(firstDuplicate(s));
    }

    private static String firstDuplicate(String s) {
        Set<String> mySet = new HashSet<>();
        String ret = null;
        String curr = null;
        s = s.strip();
        for( int i = 0; i < s.length(); i++ ) {
            curr = String.valueOf(s.charAt(i));
            if( curr.equals(" ")) {
                continue;
            }
            if( mySet.contains(curr) )  {
                ret = curr;
                break;
            }
            mySet.add(curr);
        }
        return ret;
    }


}
