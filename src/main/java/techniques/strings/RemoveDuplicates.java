package techniques.strings;

import java.util.*;

/*
Monotonic stack
Given a string s, remove duplicates such that every letter appears only once and return lexicographically smallest string
 */
public class RemoveDuplicates {
    public static void main(String... args) {
        String s = "cbacdcbc";

        System.out.println(removeDuplicates(s));

    }

    private static String removeDuplicates(String s) {
        if( s.length() <= 1 ) {
            return s;
        }
        char[] arr = s.toCharArray();
        Map<Character, Integer> lastOccurrence = new HashMap<>();
        //store the last occurrence of ever character
        for( int i = 0; i < arr.length; i++) {
            lastOccurrence.put(arr[i], i);
        }

        Set<Character> seen = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        /* if a character is not previously seen, add it to stack and add it to 'seen' set.
        Prior to adding it, check if
        a) character on top of stack is lexico greater than this char &&
        b) character on top of stack occurs later in the string as well.
        If yes to both, pop it out of stack and remove it from a list of 'seen' characters.
         */
        for( int i = 0; i < arr.length; i++ ) {
            if( !seen.contains(arr[i])) {
                while(!stack.isEmpty() && arr[i] < stack.peek() && lastOccurrence.get(stack.peek()) > i ){
                    seen.remove(stack.pop());
                }
                stack.push(arr[i]);
                seen.add(arr[i]);
            }
        }

        StringBuilder builder = new StringBuilder();
        while( !stack.isEmpty()) {
            builder.append(stack.pop());
        }
        return builder.reverse().toString();
    }
}