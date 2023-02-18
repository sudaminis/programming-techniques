package techniques.treesgraphs.graphs;

import java.util.*;

public class AdjacencyListInput {
    public static void main(String...args) {
        int[][] edges = new int[][]{
                {0, 1}, {1, 2}, {2, 0}};
        printAdjacencyList(edges);

        edges = new int[][]{
                {0, 1}, {1, 2}, {1, 3}, {2, 3}, {3, 0}};
        printAdjacencyList(edges);
    }

    private static void printAdjacencyList(int[][] edges) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        int[] arr;
        for (int[] edge : edges) {
            arr = edge;
            for (int j = 0; j < arr.length; j++) {
                int x = arr[0];
                int y = arr[1];
                if (!graph.containsKey(x)) {
                    graph.put(x, new HashSet<>());
                }
                graph.get(x).add(y);
            }
        }
        System.out.println("Graph = " +graph);
    }


}
