package techniques.recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    static Map<Integer, Integer> cache = new HashMap<>();
    public static void main(String...args) {
        System.out.println(fib(5));
    }

    private static int fib(int i) {
        if( cache.containsKey(i)) {
            return cache.get(i);
        }
        if( i < 2) {
            return i;
        }
        int sum = fib(i-1) + fib(i-2);
        cache.put(i, sum);
        return sum;
    }

}
