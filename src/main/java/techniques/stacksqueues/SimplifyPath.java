package techniques.stacksqueues;

import java.util.ArrayList;
import java.util.List;

public class SimplifyPath {
    public static void main(String...args) {
        String str = "/a/./b/../../c/";
        String[] arr = str.split("/");
        List<String> myList = new ArrayList<>();

        for (String s : arr) {

            if (s.equals("") || s.equals(".")) {
                continue;
            } else if (s.equals("..")) {
                if (myList.size() > 0) {
                    myList.remove(myList.size() - 1);
                }
            } else {
                myList.add(s);
            }
        }


        String ans = "/" + String.join("/", myList);
        System.out.println("Simplified path = " +ans);
    }
}
