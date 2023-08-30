package misc;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeightHeap {
    public static void main(String[] args) {
        int[] stones = new int[] { 2, 7, 4, 1, 8, 1};
        System.out.println( lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for( Integer i : stones ) {
            queue.add(i);
        }
        System.out.println("Added to priorty queue = " +queue);
        if( queue.size() == 1 ) {
            return queue.remove();
        }

        while( queue.size() > 1 ) {
            int first = queue.remove();
            int second = queue.remove();

            if( first != second ) {
                second = first - second;
                queue.add(second);
            }
        }
        if( queue.isEmpty() ) {
            return 0;
        } else {
            return queue.peek();
        }
    }
}
