package techniques.stacksqueues;

import java.util.Stack;

public class RemoveAdjacentDupes {
    public static void main(String...args) {
        String str = "abbaca";
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (char aChar : chars) {
            if (stack.isEmpty()) {
                stack.push(aChar);
            } else {
                if (stack.peek() == aChar) {
                    stack.pop();
                } else {
                    stack.push(aChar);
                }
            }

        }
        StringBuffer buff = new StringBuffer();
        while( !stack.isEmpty()) {
            buff.append(stack.pop());
        }
        System.out.println(buff);
        System.out.println( buff.reverse() );
    }


}
