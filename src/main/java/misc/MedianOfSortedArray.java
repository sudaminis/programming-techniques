package misc;

/*
Median of odd array length = element at arr.length / 2
Median of even array length = element at arr.length / 2 + (arr.length / 2 - 1)
 */
public class MedianOfSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[] {
           0, 0
        };
        int[] nums2 = new int[] {
            0, 0
        };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] target = new int[size];
        int i = 0;
        int j = 0;
        int k = 0;
        int first;
        int second;
        while( i < nums1.length && j < nums2.length ) {
            first = nums1[i];
            second = nums2[j];
            if( first < second ) {
                target[k++] = first;
                ++i;
            } else {
                target[k++] = second;
                ++j;
            }
        }

        if( i >= nums1.length ) {
            while( j < nums2.length ) {
                target[k++] = nums2[j];
                ++j;
            }
        } else if( j >= nums2.length ) {
            while (i < nums1.length) {
                target[k++] = nums1[i];
                ++i;
            }
        }

        double median;
        int indx = target.length / 2;
        if( target.length % 2 == 1) {
            median = target[indx];
        } else {
            median = (double)( target[indx] + target[indx-1] ) / 2;
        }

        return median;

    }

}
