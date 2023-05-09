package techniques.stacksqueues;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String...args) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        PriorityQueue<Integer> minHeapWithValues = new PriorityQueue<>(Arrays.asList(3,1,5));

        System.out.println("Min value from minHeap = " +minHeapWithValues.peek());
        maxHeap.addAll(Arrays.asList(3,1,5));
        System.out.println("Max value from maxHeap = " + maxHeap.peek());

    }
}
