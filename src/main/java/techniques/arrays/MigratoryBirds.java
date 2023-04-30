package techniques.arrays;


import java.util.*;

public class MigratoryBirds {
    public static void main(String...args) {
        List<Integer> birds = Arrays.asList(4,4,4,1,1,1);
        System.out.println( migratoryBirds(birds) );
    }
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here

        Map<Integer,Integer> sighting = new HashMap<>();
        for (Integer integer : arr) {
            sighting.compute(integer, (key, value) -> value == null ? 1 : value + 1);
        }

        // we want to return maximum sightings with minimum key
        int maxVal = 0;
        int minKey = 0;
        int currVal;
        int currKey;

        for ( Map.Entry<Integer,Integer> e : sighting.entrySet()) {
            currVal = e.getValue();
            currKey = e.getKey();

            if( currVal > maxVal ) {
                maxVal = currVal;
                minKey = currKey;
            }

        }
        return minKey;
    }

}
