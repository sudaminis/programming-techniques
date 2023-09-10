package arrays101;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MaxDistanceBetweenElements {
    public static void main(String[] args) {
        int[] arr = new int[] {
          3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2
        };

        System.out.println(getResult(arr));
        System.out.println(getMax(arr));
    }

    private static int getMax(int[] arr) {
        Map<Integer,Integer> distance = new HashMap<>();
        int maxDistance = Integer.MIN_VALUE;
        for( int i = 0; i < arr.length; i++ ) {
            if( !distance.containsKey(arr[i])) {
                distance.put(arr[i], i);
            } else {
                maxDistance = Math.max(i - distance.get(arr[i]), maxDistance );
            }
        }
        return maxDistance;
    }

    private static Map<Integer, Integer> getResult(int[] arr) {
        Map<Integer, TreeSet<Integer>> distance = new HashMap<>();
        TreeSet<Integer> set;
        for( int i = 0; i < arr.length; i++ ) {
            if( distance.containsKey(arr[i])) {
                set = distance.get(arr[i]);
            } else {
                set = new TreeSet<>();
            }
            set.add(i);
            distance.put(arr[i], set);
        }

        Map<Integer,Integer> result = new HashMap<>();
        int s;
        for( Map.Entry<Integer, TreeSet<Integer>> e : distance.entrySet() ) {
            if( e.getValue().size() > 1 ) {
                s = e.getValue().last() - e.getValue().first();
                result.put(e.getKey(), s);
            }
        }

        return result;
    }
}
