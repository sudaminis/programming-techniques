package techniques.arrays;

import java.util.*;

public class LonelyInteger {

    public static void main(String...args) {
        System.out.println(lonelyInteger(Arrays.asList(1,2,3,4,3,2,1)));
    }

    public static int lonelyInteger(List<Integer> a) {
        // Write your code here

        Set<Integer> values = new HashSet<>();
        for( Integer i: a) {
            if( values.contains(i)) {
                values.remove(i);
            } else {
                values.add(i);
            }
        }
        return values.stream().findFirst().get();

    }
}
