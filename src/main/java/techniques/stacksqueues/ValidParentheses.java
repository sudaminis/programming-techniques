package techniques.stacksqueues;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String...args) {
        //'(', ')', '{', '}', '[' and ']'
        Map<Character,Character> parentheses = new HashMap<>();

        parentheses.put('(', ')');
        parentheses.put('{', '}');
        parentheses.put('[', ']');

        String str = "()";

        System.out.println(isValid(str, parentheses));

    }

    private static boolean isValid(String str, Map<Character, Character> parentheses) {

        char[] chars = str.toCharArray();
        Stack<Character> values = new Stack<>();
        for( Character c: chars) {
            if( parentheses.containsKey(c)) {
                values.push(c);
                continue;
            }
            if( values.isEmpty()) {
                return false;
            }
            char prevChar = values.pop();
            if( c != parentheses.get(prevChar)) {
                return false;
            }
        }
        return values.isEmpty();
    }


}
