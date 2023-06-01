package techniques.recursion;

public class ReverseString {
    public static void main(String...args) {
        System.out.println(reverse("yash"));
    }

    private static String reverse(String s) {

        System.out.println("Received = " +s);
        //base case
        if( s.length() == 1) {
            return s;
        }

        //recursive case
        int appendIndex = s.length()-1;
        String append = String.valueOf(s.charAt(appendIndex));
        return append + reverse(s.substring(0,appendIndex));
    }
}
