package graphs;

import java.util.*;

public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length + 1;
        int[] indegree = new int[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge: edges) {
            int u = edge[0], v = edge[1];
            indegree[u]++;
            indegree[v]++;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        Deque<Integer> queue = new LinkedList<>();
        for (int i = 1; i < n; i++) {
            if (indegree[i] == 1) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            var head = queue.removeFirst();
            indegree[head]--;
            for(int edge: adj.get(head)) {
                indegree[edge]--;
                if (indegree[edge] == 1) {
                    queue.add(edge);
                }
            }
        }

        for (int i = edges.length - 1; i >= 0; i--) {
            int u = edges[i][0], v = edges[i][1];
            if (indegree[u] == 2 && indegree[v] > 0) {
                return new int[]{u, v};
            }
        }
        return new int[0];
    }

    public int[] redundantConnectionUnion(int[][] edges) {
        var size = edges.length + 1;
        var unionFind = new UnionFind(size);
        for(int[] edge: edges) {
            var x = edge[0];
            var y = edge[1];
            if (!unionFind.union(x, y)) {
                return new int[]{x, y};
            }
        }

        return new int[0];
    }

    class UnionFind {
        int[] parent;
        int[] rank;

        UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }

        int find(int edge) {
            if (parent[edge] != edge) {
                parent[edge] = find(parent[edge]);
            }
            return parent[edge];
        }

        boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootY == rootX) {
                // Already unified
                return false;
            }

            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
            return true;
        }
    }


}
