package techniques.treesgraphs.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//input can be given in multiple ways to build a graph.
//using this input, we need to build a datastructure that will tell us
//how nodes are connected.
public class DirectedEdgesInput {
    public static void main(String...args) {
        //unidirectional graph
        int[][] edges = new int[][] {
                {0, 1}, {1, 2}, {2, 0}, {2, 3}
            };
        Map<Integer, List<Integer>> uni_graph = new HashMap<>();
        for (int[] arr : edges) {
            int x = arr[0];
            int y = arr[1];

            if (!uni_graph.containsKey(x)) {
                uni_graph.put(x, new ArrayList<>());
            }
            uni_graph.get(x).add(y);
        }

        Map<Integer, List<Integer>> bi_graph = new HashMap<>();
        for (int[] arr : edges) {
            int x = arr[0];
            int y = arr[1];

            if (!bi_graph.containsKey(x)) {
                bi_graph.put(x, new ArrayList<>());
            }
            bi_graph.get(x).add(y);

            if (!bi_graph.containsKey(y)) {
                bi_graph.put(y, new ArrayList<>());
            }
            bi_graph.get(y).add(x);
        }

        System.out.println("Uni directional graph = " + uni_graph);
        System.out.println("Bi directional graph = " + bi_graph);
    }


}
