package techniques.slidingwindow;

public class SubArraySums {
//queries = [[0, 3], [2, 5], [2, 4]]
    public static void main( String...args) {
        int[] nums = new int[] {1, 6, 3, 2, 7, 2};
        int[][] queries = new int[3][2];
        queries[0][0] = 0;
        queries[0][1] = 3;

        queries[1][0] = 2;
        queries[1][1] = 5;

        queries[2][0] = 2;
        queries[2][1] = 4;

        int limit = 13;

        findSubarraySum(nums, queries, limit);
    }

    private static void findSubarraySum(int[] nums, int[][] queries, int limit) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for( int i = 1; i < nums.length; i++ ) {
            prefix[i] = prefix[i-1] + nums[i];
            System.out.println("prefix at " + i + " = " +prefix[i]);
        }



        boolean[] ans = new boolean[queries.length];
        int sum = 0;
        for( int i = 0; i < queries.length; i++) {
            System.out.println(queries[i][1]);
            System.out.println(queries[i][0]);
            sum = prefix[queries[i][1]] - prefix[queries[i][0]] + nums[i];
            System.out.println("***" + sum);
            if( limit > sum ) {
                ans[i] = true;
            }
        }

        for( int i = 0; i < ans.length; i++ ) {
            System.out.println(ans[i]);
        }
    }
}
