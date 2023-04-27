package techniques.strings;

import java.util.Scanner;

public class CamelCase {
    private static final String SPLIT = "S";
    private static final String COMBINE = "C";
    private static final String METHOD = "M";

    private static final String OPEN_CLOSE = "()";
    private static final char SPACE = ' ';
    private static final String COLON = ";";
    private static final String CLASS = "C";

    public static void main(String...args) {
        //S;M;plasticCup() C;V;mobile phone S;C;LargeSoftwareBook S;V;pictureFrame
        Scanner sc = new Scanner("C;M;white sheet of paper");

        String input;
        String operation;
        String type;
        String content;
        while(sc.hasNext()) {
            input = sc.nextLine();
            String[] vals = input.split(COLON);
            operation = vals[0];
            type = vals[1];
            content = vals[2];

           if( operation.equals(SPLIT)) {
               System.out.println(handleSplit(content));
           } else if( operation.equals(COMBINE)) {
               System.out.println(handleCombine(type,content));
           } else {
               System.out.println("Unknown operation");
           }
        }
    }

    private static String handleCombine(String type, String content) {
        StringBuilder builder = new StringBuilder();
        char[] arr = content.toCharArray();
        boolean capitalize = false;
        for( int i = 0; i < arr.length; i++) {
            if( type.equals(CLASS) && i == 0) {
                builder.append(Character.toUpperCase(arr[i]));
            }
            else if(capitalize) {
                builder.append(Character.toUpperCase(arr[i]));
                capitalize = false;
            }
            else if( arr[i] == SPACE ) {
                capitalize = true;
            } else {
                builder.append(arr[i]);
            }
        }
        if( type.equals(METHOD)) {
            builder.append(OPEN_CLOSE);
        }
        return builder.toString();
    }

    private static String handleSplit(String content) {
        StringBuilder builder = new StringBuilder();
            if( content.indexOf('(') > 0) {
                content = content.substring(0, content.indexOf('('));
            }
            char[] arr = content.toCharArray();
        for (char c : arr) {
            if (Character.isUpperCase(c)) {
                builder.append(SPACE);
                builder.append(Character.toLowerCase(c));
            } else {
                builder.append(c);
            }
        }
            return builder.toString().trim();

    }
}
