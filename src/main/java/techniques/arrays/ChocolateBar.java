package techniques.arrays;

import java.util.Arrays;
import java.util.List;

public class ChocolateBar {

    public static void main(String...args) {
        List<Integer> chocolate = Arrays.asList(2,2,1,3,2); // 2, 2, 2, 3, 1 // 4 1
        int d = 4;
        int l = 2;

        System.out.println(birthday(chocolate, d,l));
    }

    public static int birthday(List<Integer> candyBar, int birthDay, int month) {
        // Write your code here
        // month consecutive length with sum of birthday
        int step = candyBar.size() - month;
        int sum;
        int next;
        int ans = 0;
        int count;
        for( int i = 0; i < step; i++) {
            sum = candyBar.get(i);
            next = i + 1;
            count = 1;
            while( count < month) {
                sum += candyBar.get(next++);
                ++count;
            }
            if( sum == birthDay ) {
                ++ans;
            }
        }

        return ans;

    }

}
