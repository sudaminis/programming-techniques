package techniques.treesgraphs.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfProvinces {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static boolean[] seen;
    public static void main(String...args) {
        int[][] connected = new int[][] {
            {1,1,0},
            {1,1,0},
            {0,0,1}
        };

        graph = buildGraph(connected);

        System.out.println("Built graph = " +graph);

        seen = new boolean[connected.length];

        int numOfProvinces = getProvinces(seen);

        System.out.println("Connected provinces = " +numOfProvinces);
    }
    private static Map<Integer, List<Integer>> buildGraph(int[][] connected) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int n = connected.length;
        for( int i = 0; i < n; i++) {
            if( !graph.containsKey(i)) {
                graph.put(i, new ArrayList<>());
            }
            for( int j = i+1; j < n; j++) {
                if( !graph.containsKey(j)) {
                    graph.put(j, new ArrayList<>());
                }
                if( connected[i][j] == 1) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        return graph;
    }

    private static int getProvinces(boolean[] seen) {
        int ans = 0;
        for( int i = 0; i < seen.length; i++) {
            if(!seen[i]) {
                seen[i] = true;
                ++ans;
                dfs(i);
            }
        }
        return ans;
    }

    private static void dfs(int node) {
        List<Integer> neighbors = graph.get(node);
        for( Integer i: neighbors) {
            if(!seen[i]) {
              seen[i] = true;
              dfs( i);
            }
        }
    }

}
