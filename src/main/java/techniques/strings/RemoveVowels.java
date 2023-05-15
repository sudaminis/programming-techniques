package techniques.strings;

public class RemoveVowels {
    public static void main(String...args) {
        String s = "leetcodeisacommunityforcoders";
        System.out.println(removeVowels(s));
    }
    public static String removeVowels(String s) {
        StringBuilder builder = new StringBuilder();

        for( Character c: s.toCharArray()) {
            if( c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                builder.append(c);
            }
        }
        return builder.toString();

    }
}
