package misc;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = new int[] {
           7, 1, 5, 3, 6, 4
        };

        System.out.println(maxProfitBruteForce(arr));
        System.out.println(maxProfitKadane(arr));
    }

    private static int maxProfitKadane(int[] arr) {
        int maxProfitSoFar = 0; // store max profit
        int minPriceSoFar = Integer.MAX_VALUE; // store valley
        int currentMaxProfit;

        for (int j : arr) {
            if (j < minPriceSoFar) {
                minPriceSoFar = j;
            } else {
                currentMaxProfit = j - minPriceSoFar;
                if (currentMaxProfit > maxProfitSoFar) {
                    maxProfitSoFar = currentMaxProfit;
                }
            }
        }

        return maxProfitSoFar;
    }

    private static int maxProfitBruteForce(int[] arr) {

        int maxProfitSoFar = Integer.MIN_VALUE;
        int buyCost;
        int profit;
        for( int i = 0; i < arr.length; i++ ) {
            buyCost = arr[i];
            for( int j = i+1; j < arr.length; j++) {
                if( arr[j] > buyCost ) {
                   profit = arr[j] - arr[i];
                   if( profit > maxProfitSoFar ) {
                       maxProfitSoFar = profit;
                   }
                }
            }
        }
        return maxProfitSoFar;
    }
}
