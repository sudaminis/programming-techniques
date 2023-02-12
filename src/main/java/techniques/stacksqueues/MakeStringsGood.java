package techniques.stacksqueues;

import java.util.Stack;

public class MakeStringsGood {

    public static void main(String...args) {
        String s = "leEeetcode";
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for( Character c: arr) {
            if( stack.isEmpty()) {
                stack.push(c);
            } else if ( isPair( c, stack.peek())) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuffer buff = new StringBuffer();
        while( !stack.isEmpty() ) {
            buff.append(stack.pop());
        }
        System.out.println(buff.reverse());
    }

    private static boolean isPair(Character c, Character peek) {
        int numeric1 = Character.getNumericValue(c);
        int numeric2 = Character.getNumericValue(peek);

        if( numeric1 == numeric2 && c!= peek) {
            return true;
        }
        return false;
    }
}
