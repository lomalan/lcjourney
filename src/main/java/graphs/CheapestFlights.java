package graphs;

import java.util.*;

public class CheapestFlights {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // Create adjacency list
        List<List<NodeData>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] flight: flights) {
            adj.get(flight[0]).add(new NodeData(flight[1], flight[2], 0));
        }
        // Filling the distances
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        Queue<NodeData> minHeap = new LinkedList<>();
        minHeap.add(new NodeData(src, 0, 0));

        while (!minHeap.isEmpty()) {
            var nodeData = minHeap.remove();
            var stops = nodeData.stops;
            if (stops > k) {
                continue;
            }

            for (NodeData edge: adj.get(nodeData.node)) {
                int nextCost = edge.cost + nodeData.cost;
                if (nextCost < dist[edge.node]) {
                    dist[edge.node] = nextCost;
                    minHeap.add(new NodeData(edge.node, nextCost, stops + 1));
                }
            }

        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }

    private final class NodeData {
        int node;
        int cost;
        int stops;

        public NodeData(int node, int cost, int stops) {
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }
    }
}
