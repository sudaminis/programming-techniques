package misc;

public class FibLoop {
    public static void main(String[] args) {
        int n = 8;
        System.out.println( "Fib of 8 is " + fib(n));
    }

    private static int fib(int n) {
            //5 -- 0, 1, 1, 2, 3
            //3 -- 0, 1, 1, 2
            //4 -- 0, 1, 1, 2, 3
            // 8 -- 0, 1, 1, 2, 3, 5, 8, 13, 21
            if( n <= 1 ) {
                return n;
            }
            int[] ans = new int[n+1];
            ans[0] = 0;
            ans[1] = 1;

            for( int i = 2; i <= n; i++) {
                ans[i] = ans[i-1] + ans[i-2];
            }

            return ans[n];
        }
}
