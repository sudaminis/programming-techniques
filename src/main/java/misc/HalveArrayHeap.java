package misc;

import java.util.Collections;
import java.util.PriorityQueue;

public class HalveArrayHeap {
    public static void main(String[] args) {

    }

    public int halveArray(int[] nums) {
        PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        double currentSum = 0;
        for (Integer i : nums) {
            Double d = Double.valueOf(i);
            queue.add(d);
            currentSum += d;
        }

        System.out.println("Current sum before = " + currentSum);

        double targetSum = currentSum / 2.0;
        System.out.println("target sum = " + targetSum);
        int numOfOperations = 0;
        double temp;
        while (currentSum > targetSum) {
            temp = queue.remove();
            currentSum -= temp;
            queue.add(temp / 2);
            currentSum += temp / 2;
            numOfOperations += 1;
        }

        System.out.println("Current sum after = " + currentSum);


        return numOfOperations;
    }
}
