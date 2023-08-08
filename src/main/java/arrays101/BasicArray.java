package arrays101;

public class BasicArray {
    static int[] squareNumbers1 = new int[10];
    static int[] squareNumbers2 = new int[10];

    public static void main(String[] args) {
        for( int i = 1; i < 11; i++) {
            squareNumbers1[i-1] = i * i;
        }

        for( int i = 0; i < 10; i++) {
            squareNumbers2[i] = (i+1) * ( i+1);
        }

        for( int square:squareNumbers1) {
            System.out.println(square);
        }
        System.out.println("#############");
        for( int square:squareNumbers2) {
            System.out.println(square);
        }
    }
}
