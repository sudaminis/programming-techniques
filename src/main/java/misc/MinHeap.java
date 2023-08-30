package misc;

import java.util.PriorityQueue;

// by default, java has min heap.
// to implement max heap - give Collections.reverseOrder() to heap constructor.
public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int[] nums = new int[]
                {67, 341, 234, -67, 12, -976};
        for( Integer i: nums ) {
            priorityQueue.add(i);
        }

        System.out.println("Min element = " +priorityQueue.peek());


    }
}
