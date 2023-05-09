package techniques.stacksqueues;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class JesseCookies {
    public static void main(String...args) {
        int k = 10;
        List<Integer> arr = Arrays.asList(1,1,1);
        System.out.println(cookies(k, arr));

    }
    //sweetness = ( 1 * least sweet cookie + 2
    public static int cookies(int k, List<Integer> A) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(A);
        System.out.println("Got k = "+k);
        System.out.println("Got list = " +A);
        int f;
        int s;
        int iter = 0;
        while( !queue.isEmpty() && queue.peek() < k ) {
            if( iter >= A.size()) {
                return -1;
            }
            f = queue.poll();
            if( queue.peek() == null ) {
                return -1;
            }
            s = queue.poll();
            queue.add(f+ ( 2 * s) );
            ++iter;
        }
        return iter;


    }

}
