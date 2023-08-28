package misc;

public class ReverseString {
    public static void main(String[] args) {
        String s = " I am a normal string";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        char temp;
        while( i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            ++i;
            --j;
        }

        return String.valueOf(arr);

    }


}
