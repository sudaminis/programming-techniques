package misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[] {
          0,0,1,1,1,2,2,3,3,4
        };
        removeDuplicatesBrute(arr);
        removeDuplicatesInPlace(arr);
    }

    // start from index 1 because the element at index 0 is the first element you have seen anyway
    // insertIndex keep track of where the next insertion will be.
    // loop variable i keeps track of the next variable that needs to be inserted.
    private static void removeDuplicatesInPlace(int[] arr) {
        int insertIndex = 1;
        //0,0,1,1,1,2,2,3,3,4
        for ( int i = 1; i < arr.length; i++ ) {
            if( arr[i-1] != arr[i]) {
                arr[insertIndex] = arr[i];
                ++insertIndex;
            }
        }
    }

    private static void removeDuplicatesBrute(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for( int i = 0; i < arr.length; i++ ) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(i, 0) + 1);
        }

        Set<Integer> allKeys = frequencyMap.keySet();

        int indx = 0;
        for( Integer i: allKeys ) {
            arr[indx++] = i;
        }

        System.out.println("done");
    }


}
