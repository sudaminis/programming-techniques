package techniques.binarysearch;

/*
This uses binary search technique on solution space.
To find max number = if it works for x - that means it will work for any number less than x.
To find min number = if it works for x - that means it will work for any number greater than x.

In this problem, we want to find min number of bananas koko should eat so that he can finish all bananas in given max hours limit.
 */
public class KokoEatingBananans {
    static int limit;

    public static void main(String... args) {

        int[] piles = new int[] { 3,6,7,11};
        int hours = 8;
        System.out.println(minEatingSpeed(piles, hours));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        limit = h;
        int left = 1;
        int right = 0;
        // you will eat min 1 banana per hour; no point in eating less than that
        // you can eat max bananas = largest in piles
        for (int bananas : piles) {
            right = Math.max(right, bananas);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("checking for speed = " +mid);
            if (check(mid, piles)) {
                System.out.println("Eating " +mid+ " bananas works. That means less than " + mid + " will also work. ");
                right = mid - 1;
                System.out.println("Right = " +right);
            } else {
                System.out.println("Eating "+mid+ " bananas doesn't work. That means more than " + mid + " will be needed");
                left = mid + 1;
                System.out.println("Left = " +left);
            }
        }
        return left;
    }

    public static boolean check(double k, int[] piles) {
        int hours = 0;
        double ans;
        System.out.println("Eating " +k+ " bananas per hour");
        for (double bananas : piles) {
            ans = Math.ceil(bananas/k);
            hours += ans;
        }
        System.out.println( "Total hours needed to finish the pile = " +hours);
        return hours <= limit;
    }
}
