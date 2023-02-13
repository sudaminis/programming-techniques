package techniques.stacksqueues;

import java.util.Stack;

/*
Monotonic stack example
 */
public class DailyTemperatures {

    public static void main(String...args) {
        int[] temp = new int[] {40, 35,32,37,50};
        int[] ans = dailyTemperatures(temp);
        for (int an : ans) {
            System.out.println(an);
        }
    }

    public static int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        Stack<Integer> stack = new Stack<>();
        for( int i = 0; i < temp.length; i++ ) {
            while( !stack.isEmpty() && temp[stack.peek()] < temp[i]) {
                int indx = stack.pop();
                ans[indx] = i - indx;
            }
            stack.push(i);
        }
        return ans;
    }
}
