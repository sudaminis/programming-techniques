package misc;

public class FindInSortedBinarySearch {

    public static void main(String[] args) {
        int[] sortedArray = new int[] {
                1,3,5,7,8,9,9
        };

        int find = 9;

        System.out.println(findIndexOfElement( sortedArray, find));
    }

    private static int findIndexOfElement(int[] sortedArray, int find) {
        int left = 0;
        int right = sortedArray.length - 1;

        while ( left <= right ) {
            int mid = left + (right - left) / 2;
            if( sortedArray[mid] == find ) {
                return mid;
            } else if( sortedArray[mid] > find ) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;

    }


}
