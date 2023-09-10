package arrays101;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraySubsetOfAnother {
    public static void main(String[] args) {
        int[] arr1 = new int[] {
           3,8,12,6,5,9
        };

        int[] arr2 = new int[] {
           3,6,12
        };

        System.out.println(isSubsetBrute(arr1, arr2));
        System.out.println(isSubset(arr1,arr2));
    }

    private static boolean isSubset(int[] arr1, int[] arr2) {
        Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());

        Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

        return set1.containsAll(set2);
    }

    static boolean isSubsetBrute(int[] arr1, int[] arr2) {
        boolean found;
        for (int k : arr2) {
            found = false;
            for (int i : arr1) {
                if (k == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
