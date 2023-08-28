package misc;

import java.util.HashMap;
import java.util.Map;

public class FibRecursion {
    static Map<Integer,Integer> values = new HashMap<>();
    public static void main(String[] args) {
        values.put(0,0);
        values.put(1, 1);
        int n = 7;
        System.out.println( "Recursive Fib of 7 is " + fibRecursion(n));
    }

    private static int fibRecursion(int n) {
        if( n <= 1 ) {
            return values.get(n);
        }
        int f;
        if( values.containsKey(n-1)) {
            f = values.get(n-1);
        } else {
            f = fibRecursion(n-1);
            values.put(n-1, f);
        }
        int s;
        if( values.containsKey(n-2)) {
            s = values.get(n-2);
        } else {
            s = fibRecursion(n-2);
            values.put(n-2, s);
        }

        return f + s;
    }
}
