package concepts.ood;

import java.util.Stack;

class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        stack.push(val);
        if( minStack.isEmpty() || minStack.peek() >= val ) {
            minStack.push(val);
            System.out.println(minStack);
        }
    }

    public void pop() {
        int val;
        if( !stack.isEmpty()) {
            val = stack.pop();
            if( !minStack.isEmpty() && minStack.peek() == val ) {
                minStack.pop();
            }
        }
    }

    public int top() {
        int element = -1;
        if( !stack.isEmpty()) {
            element = stack.peek();
        }
        return element;
    }

    public int getMin() {
        int element = -1;
        if( !minStack.isEmpty() ) {
            element = minStack.peek();
        }
        return element;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */