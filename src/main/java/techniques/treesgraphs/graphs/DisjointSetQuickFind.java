package techniques.treesgraphs.graphs;

/*
Note:
N is the number of vertices in the graph.

When initializing a union-find constructor, we need to create an array of size
N with the values equal to the corresponding array indices; this requires linear time.
Each call to find will require O(1) time since we are just accessing an element of the array at the given index.
Each call to union will require O(N) time because we need to traverse through the entire array and update the root vertices for all the vertices of the set that is going to be merged into another set.
The connected operation takes O(1) time since it involves the two find calls and the equality check operation.
 */
public class DisjointSetQuickFind {
    int[] root;

    DisjointSetQuickFind( int n) {
        //initialize root array and put root of all elements as itself
        root = new int[n];
        for( int i = 0; i < n; i++) {
            root[i] = i;
        }
    }

    boolean connected( int x, int y) {
        return root[x] == root[y];
    }

    int find( int me) {
        return root[me];
    }

    void union( int x, int y) {
        int root_x = find(x);
        int root_y = find(y);
        if( root_x != root_y) {
            for( int i = 0; i < root.length; i++) {
                if( root[i] == root_y) {
                    root[i] = root_x;
                }
            }
        }
    }

    public static void main(String...args) {
        DisjointSetQuickFind uf = new DisjointSetQuickFind(10);
        uf.union(1, 2);
        uf.union(2, 5);
        uf.union(5, 6);
        uf.union(6, 7);
        uf.union(3, 8);
        uf.union(8, 9);
        System.out.println(uf.connected(1, 5)); // true
        System.out.println(uf.connected(5, 7)); // true
        System.out.println(uf.connected(4, 9)); // false
    }
}
