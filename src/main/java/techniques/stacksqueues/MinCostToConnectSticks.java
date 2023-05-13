package techniques.stacksqueues;

import java.util.PriorityQueue;

public class MinCostToConnectSticks {
    public static void main(String...args) {
        int[] arr = new int[] {
            2,4,3
        };
        System.out.println("Cost to connect sticks " +connectSticks(arr));
    }

    public static int connectSticks(int[] sticks) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int stick : sticks) {
            queue.add(stick);
        }

        System.out.println(queue);
        int first;
        int second = 0;
        int cost = 0;
        while( queue.size() > 1 ) {
            first = queue.poll();
            System.out.println("Queue after removing first elemenet = " + queue);
            if( queue.peek() != null ) {
                second = queue.poll();
            }
            cost += first + second;
            queue.add(first + second);
            System.out.println("Queue after adding new element = " +queue);
        }
        System.out.println("Queue at the end = " +queue);
        System.out.println("Min cost to connect sticks = " +cost);
        return cost;
    }
}
