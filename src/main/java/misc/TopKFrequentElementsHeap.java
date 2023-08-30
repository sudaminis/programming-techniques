package misc;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElementsHeap {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        topK(nums, 2);

    }

    static int[] topK(int[] nums, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(frequencyMap);

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));

        queue.addAll(frequencyMap.keySet());

        System.out.println(queue);

        while (queue.size() > k) {
            queue.poll();
        }

        System.out.println(queue);

        int[] result = new int[queue.size()];
        int i = 0;
        while (!queue.isEmpty()) {
            result[i] = queue.poll();
            ++i;
        }

        return result;

    }
}
