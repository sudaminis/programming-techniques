package techniques.twopointers;

import org.springframework.lang.NonNull;

import static java.util.Objects.requireNonNull;

public class ReverseString {
    public static void main(String...args) {
        char[] chars = new char[]{ '!','!','!','!' };
        requireNonNull(chars);

        System.out.println(reverse(chars));
    }

    private static String reverse(@NonNull char[] chars) {

        
        int left = 0;
        int right = chars.length-1;
        char temp;
        while( left < right ) {
            if( chars[right] != chars[left]) {
                temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
            }
            ++left;
            --right;
        }
        return String.copyValueOf(chars);
    }
}
