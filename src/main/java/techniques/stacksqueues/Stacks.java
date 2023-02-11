package techniques.stacksqueues;

import java.util.Stack;

public class Stacks {
    public static void main(String...args) {

        Stack<Integer> myStack = new Stack<>();
        myStack.push(10);
        myStack.push(11);
        myStack.push(42);
        System.out.println( "pop " + myStack.pop());
        System.out.println( "peek " + myStack.peek());


    }
}
