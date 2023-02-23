package techniques.treesgraphs.graphs;

/*
Graph theory disjoint sets allows to define interconnection between vertices ( union )
and then find which vertices are connected.
QuickFind algorithm lets you find the interconnection in O[1].
union take O[n]
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
