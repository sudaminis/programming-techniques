package techniques.stacksqueues;

public class NextGreaterElement {
    public static void main (String...args) {
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};
        int[] ans = nextGreaterElement(nums1, nums2);
        for (int an : ans) {
            System.out.println(an);
        }

    }
    // nums1 is subset of nums2
    //absolute brute force
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int first;
        for( int i = 0; i < nums1.length; i++) {
            first = nums1[i];
            for( int j = 0; j < nums2.length; j++) {
                if( nums2[j] == first ) {
                    boolean found = false;
                    for ( int k = j+1; k < nums2.length; k++) {
                        if( nums2[k] > nums2[j]) {
                            ans[i] = nums2[k];
                            found = true;
                            break;
                        }
                    }
                    if ( !found ) {
                        ans[i] = -1;
                    }
                }
            }
        }
        return ans;
    }
}
