package top50strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = new String[]{
                "flower", "nothing", "tv"
        };
        System.out.println(longestCommonPrefix(strings));

    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        String s;
        for( int i = 1; i <strs.length; i++ ) {
            s = strs[i];

            while( s.indexOf(prefix) != 0 ) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if( prefix.length() == 0 ) {
                    return "";
                }
            }

        }

        return prefix;
    }
}



