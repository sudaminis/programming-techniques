package concepts.lambaexpressions.noargument;

public class NoArgLambdaDemo {
    public static void main(String... args)  {
        NoArg constantVal = () -> 3.14;
        NoArg randomVal = () -> Math.random() * 100;

        System.out.println(constantVal.getValue());
        System.out.println(randomVal.getValue());
        System.out.println(randomVal.getValue());
    }
}
