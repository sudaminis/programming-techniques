package techniques.stacksqueues;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String...args) {
        String s = "ab#c";
        String t = "ad#c";

        String s1 = removeBackSpace(s);
        String s2 = removeBackSpace(t);

        System.out.println(s1.equals(s2));

    }

    private static String removeBackSpace(String s) {
        Stack<Character> s1 = new Stack<>();
        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (aChar != '#') {
                s1.push(aChar);
            } else {
                if( !s1.isEmpty()) {
                    s1.pop();
                }
            }
        }
        return String.valueOf(s1);
    }
}
