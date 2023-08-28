package misc;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] arr = new int[] {
                2,5,8,7,3,2
        };

        reverseElementsInPlace(arr);
        System.out.println("done reversal");
    }

    private static void reverseElementsInPlace(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int temp;
        while( i <= j ) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            ++i;
            --j;
        }

    }
}
