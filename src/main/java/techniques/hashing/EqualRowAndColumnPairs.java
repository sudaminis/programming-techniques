package techniques.hashing;

import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static void main(String...args) {
       // int[][] grid = new int[][] {
         //       {3,2,1},
           //     {1,7,6},
             //   {2,7,7}
        //};

        int[][] grid;

        grid = new int[][] {
                {11,1},
                {1,11}
        };
        System.out.println("Number of pairs = " + equalPairs(grid));

    }
    public static int equalPairs(int[][] grid) {
        Map<String,Integer> rows = new HashMap<>();
        Map<String,Integer> columns = new HashMap<>();

        for (int[] row : grid) {
            StringBuffer rowBuff = new StringBuffer();
            for (int i : row) {
                rowBuff = rowBuff.append(i).append(',');
            }
            String rowStr = rowBuff.toString();
            rows.put(rowStr, rows.getOrDefault(rowStr, 0) + 1);
        }
        for( int i = 0 ; i < grid.length; i++) {
            var columnBuff = new StringBuffer();
            for (int[] ints : grid) {
                columnBuff = columnBuff.append(ints[i]).append(',');
            }
            String columnStr = columnBuff.toString();
            columns.put(columnStr, columns.getOrDefault(columnStr,0) +1);

        }
        System.out.println("Rows = " + rows);
        System.out.println("Columns = " + columns);
        int ans = 0;
        for( String s : rows.keySet()) {
            if( columns.containsKey(s)) {
                ans += rows.get(s) * columns.get(s);
            }
        }
        return ans;
    }
}
