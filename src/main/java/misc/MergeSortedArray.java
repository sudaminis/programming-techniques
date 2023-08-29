package misc;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = new int[] {
                2, 3, 4, 6
        };

        int[] arr2 = new int[] {
                1, 5, 7, 8, 9
        };

        System.out.println(mergeSorted(arr1,arr2));
    }

    private static List<Integer> mergeSorted(int[] arr1, int[] arr2) {
        List<Integer> target = new ArrayList<>(arr1.length + arr2.length);
        int i = 0;
        int j = 0;

        while( i < arr1.length && j < arr2.length ) {
            if( arr1[i] < arr2[j]) {
                target.add(arr1[i]);
                ++i;
            } else {
                target.add(arr2[j]);
                ++j;
            }
        }
        if( i == arr1.length ) {
            while( j < arr2.length) {
                target.add(arr2[j]);
                ++j;
            }
        } else if( j == arr2.length ) {
            while( i < arr1.length) {
                target.add(arr1[i]);
                ++i;
            }
        }

        return target;
    }


}
