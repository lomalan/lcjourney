package graphs;

import java.util.*;

public class NetworkDelay {
    public int networkDelayTime(int[][] times, int n, int k) {
        // Implement Dijkstra algo
        // Create adj list
        List<List<NodeData>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] time: times) {
            adj.get(time[0]).add(new NodeData(time[1], time[2]));
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<NodeData> queue = new PriorityQueue<>(Comparator.comparingInt(data -> data.dist));
        queue.add(new NodeData(k, 0));
        dist[k] = 0;
        while (!queue.isEmpty()) {
            var data = queue.poll();
            if (data.dist > dist[data.node]) {
                continue;
            }
            for(NodeData node: adj.get(data.node)) {
                var distance = node.dist + data.dist;
                if (dist[node.node] > distance) {
                    dist[node.node] = distance;
                    queue.add(new NodeData(node.node, distance));
                }
            }
        }

        return dist[n] == Integer.MAX_VALUE ? -1 : dist[n];
    }

    private class NodeData {
        int node;
        int dist;

        public NodeData(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }
}
