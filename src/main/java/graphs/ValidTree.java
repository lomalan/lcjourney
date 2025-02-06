package graphs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ValidTree {

    public boolean validTree(int n, int[][] edges) {
        if (edges.length == 0) {
            return true;
        }
        if (edges.length < n - 1) {
            return false;
        }
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[n];
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            indegree[x]++;
            indegree[y]++;
            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        Deque<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            if (indegree[i] == 1) {
                queue.add(i);
            }
        }

        int index = 0;
        while(!queue.isEmpty()) {
            var head = queue.removeFirst();
            index++;
            for(int edge: adj.get(head)) {
                indegree[edge]--;
                if (indegree[edge] == 1) {
                    queue.add(edge);
                }
            }
        }
        return index == n;
    }
}
