package techniques.twopointers;
/*
Given two sorted integer arrays, return an array that combines both of them and is also sorted.
 */
public class CombineSortedArrays {

    public static void main(String...args) {
        int[] arr1 = new int[]{1,4,7,8};
        int[] arr2 = new int[]{3,5,6};


        combine(arr1, arr2);
    }

    private static void combine(int[] arr1, int[] arr2) {
        int first = 0, second = 0;
        int[] answer = new int[arr1.length+arr2.length];
        int pointer = 0;

        while( first < arr1.length && second < arr2.length) {
            if( arr1[first] < arr2[second]) {
                answer[pointer++] = arr1[first++];
            } else {
                answer[pointer++] = arr2[second++];
            }
        }
        while( first < arr1.length) {
            answer[pointer++] = arr1[first++];
        }
        while( second < arr2.length) {
            answer[pointer++] = arr2[second++];
        }

        pointer = 0;
        while( pointer < answer.length ) {
            System.out.println(answer[pointer++]);
        }

    }


}
