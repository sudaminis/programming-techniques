package techniques.treesgraphs.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Find if two nodes in a graph are connected
// Use depth first search algorithm
public class GraphDFS {
    public static void main(String...args) {
        int[][] edges = new int[][] {
          { 0, 1}, {0,2},{1,3},{3,4},{3,5},{4,5}
        };
        int vertices = 6;
        System.out.println(validPath(vertices, edges, 0, 5));

    }
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] seen = new boolean[n];
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] temp : edges) {
            graph.computeIfAbsent(temp[0], val -> new ArrayList<>()).add(temp[1]);
        }
        return dfs( seen, graph, source, destination);
    }

    private static boolean dfs(boolean[] seen, Map<Integer, List<Integer>> graph, int source, int destination) {
        if( source == destination ) {
            return true;
        }
        seen[source] = true;
        List<Integer> edges = graph.get(source);
        for( Integer i: edges ) {
            if( !seen[i]) {
                if( dfs(seen, graph, i, destination ) ) {
                    return true;
                }
            }
        }
        return false;
    }

}
