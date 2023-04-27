package techniques.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String...args) {
        System.out.println( divisibleSumPairs(3, Arrays.asList(1, 3, 2, 6, 1, 2)));

    }
    public static int divisibleSumPairs( int k, List<Integer> ar) {
        // Write your code here
        Collections.sort(ar);
        int count = 0;
        for( int i = 0; i < ar.size(); i++) {
            int first = ar.get(i);
            for( int j = i+1; j < ar.size(); j++) {
                int second = ar.get(j);
                if( (first + second) % k == 0 ) {
                    ++count;
                }
            }
        }
        return count;
    }
}
