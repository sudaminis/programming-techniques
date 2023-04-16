package concepts.lambaexpressions.exceptions;

import java.util.function.*;

public class LambdaExamples {
    public static void main(String...args) {
        Function<Integer, Integer> factorial = (n) -> {
            int val = 1;
            for( int i = 1; i < n; i++) {
              val *= i;
            }
            return val;
        };

        UnaryOperator<String> reverse = (n) -> {
            StringBuilder ans = new StringBuilder();
            char[] arr = n.toCharArray();
            for( int i = arr.length-1; i >= 0; i--) {
                ans.append(arr[i]);
            }
            return ans.toString();
        };

        Consumer<String> consume = String::toLowerCase;
        Supplier<String> supply = () -> "CONSTANT STRING";
        Predicate<Integer> isEven = (n) -> n % 2 == 0;

        BinaryOperator<Integer> multi = Math::multiplyExact;

        //Function<T,T> accepts two inputs of type T and returns a value of type T.
        //Has a method apply
        System.out.println(factorial.apply(10));
        System.out.println(factorial.apply(5));
        //UnaryOperator<T> accepts one input of type T and returns a value of type T.
        //Has a method apply
        System.out.println(reverse.apply("YASH"));
        System.out.println(reverse.apply("TANUJ"));
        //BinaryOperator accepts two inputs of type T and returns a value of type T.
        //Has a method apply
        System.out.println(multi.apply(10,30));
        System.out.println(multi.apply(56,6));
        //Consumer accepts a parameter of type T and applies certain function to it.
        //Has a method accept
        consume.accept("ssssS");
        System.out.println(supply.get());
        System.out.println(isEven.test(33));


    }
}
