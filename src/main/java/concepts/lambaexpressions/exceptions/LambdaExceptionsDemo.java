package concepts.lambaexpressions.exceptions;

public class LambdaExceptionsDemo {
    public static void main(String...args) throws ComputeAverage.EmptyArrayException {
        ComputeAverage avg = (n) -> {
            double ans = 0;
            if( n.length == 0 ) {
                throw new ComputeAverage.EmptyArrayException();
            }
            for (int j : n) {
                ans += j;
            }
            return ans / n.length;
        };

        int[] arr = new int[] { 3, 5, 6, 8, 100};
        System.out.println(avg.avg(arr));
        int[] emptyArr = new int[] {};
        System.out.println(avg.avg(emptyArr));
    }
}
