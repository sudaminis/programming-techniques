package techniques.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BreakingRecords {
    public static void main(String...args) {
        System.out.println(breakingRecords(Arrays.asList(12,24,10,24)));
    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
        if( scores.isEmpty()) {
            return Collections.emptyList();
        }
        List<Integer> count = new ArrayList<>();
        int minSoFar=scores.get(0), maxSoFar=scores.get(0), minCount=0, maxCount = 0;

        for( int i = 1; i < scores.size(); i++) {
            if( scores.get(i) < minSoFar ) {
                minSoFar = scores.get(i);
                ++minCount;
            }
            if( scores.get(i) > maxSoFar ) {
                maxSoFar = scores.get(i);
                ++maxCount;
            }
        }
        count.add(maxCount);
        count.add(minCount);

        return count;

    }
}
