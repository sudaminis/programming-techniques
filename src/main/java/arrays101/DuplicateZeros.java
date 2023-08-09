package arrays101;

/*
Given a fixed-length integer array arr, duplicate each occurrence of zero,
shifting the remaining elements to the right.
 */

import java.util.LinkedList;
import java.util.Queue;

/*
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
 */
public class DuplicateZeros {

    static int[] arr = new int[] {
            1,0,2,3,0,4,5,0
    };

    public static void main(String[] args) {
        duplicateZerosExtraSpace(arr);
        duplicateZerosWithQueue(arr);
    }

    private static void duplicateZerosWithQueue(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for( int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            if( arr[i] == 0) {
                queue.add(0);
            }
            arr[i] = queue.remove();
        }
    }

    private static void duplicateZerosExtraSpace(int[] arr) {
        int size = 0;
        for (int j : arr) {
            if (j == 0) {
                ++size;
            }
        }
        int[] destArr = new int[arr.length+size];

        int d = 0;
        for (int j : arr) {
            if (j == 0) {
                destArr[d] = 0;
                ++d;
                destArr[d] = 0;
            } else {
                destArr[d] = j;
            }
            ++d;
        }

        for (int j : destArr) {
            System.out.println(j);
        }
    }


}
