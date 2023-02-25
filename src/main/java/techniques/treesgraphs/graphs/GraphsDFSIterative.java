package techniques.treesgraphs.graphs;

import java.util.*;

public class GraphsDFSIterative {
    public static void main(String... args) {
        int source = 0;
        int destination = 2;
        int[][] edges = new int[][]{
                {0, 1}, {0, 2}, {3, 4}, {3, 5}, {4, 5}
        };
        System.out.println(isValidPath(edges, source, destination));
    }

    private static boolean isValidPath(int[][] edges, int source, int destination) {
        boolean[] seen = new boolean[5];
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] a : edges) {
            graph.computeIfAbsent(a[0], val -> new ArrayList<>()).add(a[1]);
            graph.computeIfAbsent(a[1], val -> new ArrayList<>()).add(a[0]);
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        while (!stack.isEmpty()) {
            int i = stack.pop();
            if (i == destination) {
                return true;
            }
            if (!seen[i]) {
                seen[i] = true;
                List<Integer> all = graph.get(i);
                for (Integer a : all) {
                    stack.push(a);
                }
            }
        }
        return false;
    }
}
