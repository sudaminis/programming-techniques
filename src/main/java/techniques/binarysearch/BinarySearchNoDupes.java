package techniques.binarysearch;

public class BinarySearchNoDupes {
    public static void main(String...args) {
        int[] arr = new int[] {13,17,18,21,25,28};
        System.out.println(search(arr, 18));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while( left <= right ) {
            mid = (left + right) / 2;
            if( nums[mid] == target ) {
                return mid;
            } else if ( nums[mid] > target ) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
