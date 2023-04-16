package concepts.lambaexpressions.generic;

public class GenericFunctionalInterfaceDemo {
    public static void main(String ... args ) {
        Generic<String> reverse = (str) -> {
            String rev = "";
            for( int i = str.length()-1; i >=0; --i) {
                rev += str.charAt(i);
            }
            return rev;
        };

        Generic<Integer> fact = (n) -> {
            Integer ans = 1;
            for( int i = 1; i <= n; i++ ) {
                ans = ans * i;
            }
            return ans;
        };

        System.out.println("Reverse String = " +reverse.someFunc("Yash"));
        System.out.println("Factorial = " +fact.someFunc(5));
    }
}
