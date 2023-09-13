package top50strings;

public class MergeAlternately {

    public static void main(String[] args) {

        String word1 = "ab";
        String word2 = "pqrst";

        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        int j = 0;

        while( i < word1.length() && j < word2.length() ) {
            builder.append(word1.charAt(i));
            ++i;
            builder.append(word2.charAt(j));
            ++j;
        }

        if( i < word1.length() ) {
            while( i < word1.length() ) {
                builder.append(word1.charAt(i));
                ++i;
            }
        }

        if( j < word2.length() ) {
            while( j < word2.length() ) {
                builder.append(word2.charAt(j));
                ++j;
            }
        }

        System.out.println("builder = " +builder );

        return builder.toString();

    }
}
