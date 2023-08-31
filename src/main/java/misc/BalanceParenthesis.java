package misc;
import java.util.*;

public class BalanceParenthesis {

        static Map<Character, Character> openClose = new HashMap<>();

        static {
            openClose.put('{', '}');
            openClose.put('[', ']');
            openClose.put('(', ')');

        }

        public static void main(String[] args) {
                String s = "}{";
                System.out.println( checkBalance(s) );

        }

        static boolean checkBalance(String s) {
            char[] chars = s.toCharArray();
            Stack<Character> stack = new Stack<>();
            Map<Character,Character> parentheses = new HashMap<>();

            parentheses.put('(', ')');
            parentheses.put('{', '}');
            parentheses.put('[', ']');

            for( Character c: chars) {
                if( parentheses.containsKey(c) ) {
                    stack.push(c);
                    continue;
                }
                if( stack.isEmpty()) {
                    return false;
                }
                char prevChar = stack.pop();
                if( parentheses.get(prevChar) != c) {
                    return false;
                }

            }
            return stack.isEmpty();

        }

}
