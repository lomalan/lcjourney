package graphs;

import java.util.*;

public class MinCostToConnectAllPoints {
    public int minCostConnectPoints(int[][] points) {
        // transform points to queue with distances
        int n = points.length;
        List<List<NodeData>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               int dist = calculateDistance(points[i], points[j]);
               adj.get(i).add(new NodeData(j, dist));
               adj.get(j).add(new NodeData(i, dist));
            }
        }
        boolean[] visited = new boolean[n];
        PriorityQueue<NodeData> minQueue = new PriorityQueue<>(Comparator.comparingInt(data -> data.cost));
        minQueue.add(new NodeData(0, 0));
        int cost = 0;
        int elements = 0;
        while (!minQueue.isEmpty() && elements < n) {
            var nodeData = minQueue.poll();
            if (visited[nodeData.node]) {
                continue;
            }
            cost += nodeData.cost;
            visited[nodeData.node] = true;
            for(NodeData edgeData: adj.get(nodeData.node)) {
                if (!visited[edgeData.node]) {
                    minQueue.add(edgeData);
                }
            }
            elements++;
        }
        return cost;
    }

    public int minCostOptimal(int[][] points) {
        int size = points.length;
        int[] dist = new int[size];
        boolean[] visit = new boolean[size];
        Arrays.fill(dist, Integer.MAX_VALUE);
        int edges = 0, cost = 0, node = 0;

        while (edges < size - 1) {
            visit[node] = true;
            int nextNode = -1;
            for (int i = 0; i < size; i++) {
                if (visit[i]) {
                    continue;
                }
                int curDist = calculateDistance(points[i], points[node]);
                dist[i] = Math.min(dist[i], curDist);
                if (nextNode == -1 || dist[i] < dist[nextNode]) {
                    nextNode = i;
                }
            }
            cost += dist[nextNode];
            node = nextNode;
            edges++;
        }
        return cost;
    }

    private int calculateDistance(int[] x, int[] y) {
        return Math.abs((y[0] - x[0])) + Math.abs((y[1] - x[1]));
    }

    private class NodeData {
        int node;
        int cost;

        public NodeData(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }
}
