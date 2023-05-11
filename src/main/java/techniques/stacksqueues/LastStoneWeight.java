package techniques.stacksqueues;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String...args) {
        int[] stones = new int[] {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            queue.add(stone);
        }

        int first;
        int second;

        while( true ) {
            if( queue.isEmpty()) {
                return 0;
            } else if( queue.size() == 1) {
                return queue.poll();
            }
            first = queue.poll();
            second = queue.poll();

            if( first != second ) {
                second = first - second;
                queue.add(second);
            }
        }
    }


}
