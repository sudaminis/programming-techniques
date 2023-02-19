package techniques.binarysearch;

public class Search2DMatrix {
    public static void main(String...args) {
        int[][] matrix = new int[][] {
          {1,3,5,7},
          {10,11,16,20},
          {23,30,34,60}
        };
        int target = 61;
        System.out.println(search(matrix, target));
    }

    private static boolean search(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n -1;
        int mid;
        int row;
        int column;

        while ( left <= right ) {
            mid = ( left + right ) / 2;
            row = mid / n;
            column = mid % n;

            if( matrix[row][column] == target) {
                return true;
            } else if ( matrix[row][column] > target ) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }


}
