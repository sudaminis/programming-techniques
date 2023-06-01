package techniques.recursion;

public class Factorial {
    public static void main(String...args) {
        int n = 10;

        System.out.println(fact(n));
        System.out.println(factRecursive(n));
    }

    private static int factRecursive(int n) {
        if( n <= 1 ) {
            return 1;
        }
        return n * fact(n-1);
    }

    private static int fact(int n) {
        int fact = 1;
        for( int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
