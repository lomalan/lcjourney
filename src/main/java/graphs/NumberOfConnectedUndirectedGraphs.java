package graphs;

public class NumberOfConnectedUndirectedGraphs {
    private int[] parent;
    private int[] rank;


    public int countComponents(int n, int[][] edges) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
           parent[i] = i;
           rank[i] = 1;
        }
        int res = n;
        for(int[] edge : edges) {
            if (union(edge[0], edge[1])) {
                res--;
            }
        }
        return res;
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    private boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) {
            return false;
        }

        if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else  {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
        return true;
    }
}
