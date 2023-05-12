package techniques.stacksqueues;

import java.util.*;

public class KWeakestRowsInMatrix {
    public static void main(String...args) {
        int[][] matrix = new int[][] {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
        };
        int limit = 3;
        kWeakestRows(matrix, limit);
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, List<Integer>> strengthsForRows = new HashMap<>();

        for( int row = 0; row < mat.length; row++) {
            int soldiers = 0;
            for( int column = 0; column < mat[row].length; column++) {
                if( mat[row][column] == 1) {
                    ++soldiers;
                }
            }
            if( !strengthsForRows.containsKey(soldiers)) {
                List<Integer> list = new ArrayList<>();
                list.add(row);
                strengthsForRows.put(soldiers, list);
            } else {
                List<Integer> list = strengthsForRows.get(soldiers);
                list.add(row);
                strengthsForRows.put(soldiers, list);
            }
        }

        System.out.println("Got strengths for rows = " + strengthsForRows);

        List<Integer> strengths = new ArrayList<>(strengthsForRows.keySet());
        Collections.sort(strengths);

        System.out.println("Sorted strengths = " +strengths);

        int[] ans = new int[k];
        int j = 0;
        for( Integer strength : strengths) {
            List<Integer> rows = strengthsForRows.get(strength);
            System.out.println("Got row = " + rows);
            for (Integer row : rows) {
                if (j > k - 1) {
                    break;
                } else {
                    System.out.println("Got strength = " + row);
                    ans[j++] = row;
                }
            }
        }

        return ans;
    }
}
