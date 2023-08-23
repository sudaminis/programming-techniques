package techniques.strings;

public class ReverseStringInPlace {

    public static void main(String[] args) {
        String s = "YASH";
        System.out.println(reverseInPlace(s));
    }

    private static String reverseInPlace( String s) {
        int i = 0;
        int j = s.length()-1;
        char temp;
        char[] chars = s.toCharArray();
        while( i < j ) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            ++i;
            --j;
        }
        return String.valueOf(chars);
    }
}
