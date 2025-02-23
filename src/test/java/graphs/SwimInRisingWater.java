package graphs;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SwimInRisingWater {
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] visit = new boolean[n][n];
        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.stepMax));
        minHeap.add(new Node(0, 0, grid[0][0]));

        while (!minHeap.isEmpty()) {
            var node = minHeap.poll();
            var x = node.x;
            var y = node.y;
            if (x == n - 1 && y == n -1) {
                return node.stepMax;
            }
            for (int[] direction: directions) {
                int row = direction[0] + x;
                int column = direction[1] + y;
                var outOfBounds = row < 0 || row >= n || column < 0 || column >= n;
                if (outOfBounds || visit[row][column]) {
                    continue;
                }      
                visit[row][column] = true;
                minHeap.add(new Node(row, column, Math.max(node.stepMax, grid[row][column])));   
            }
        }
        return 0;   
    }

    private class Node {
        int x;
        int y;
        int stepMax;
        Node(int x, int y, int stepMax) {
            this.x = x;
            this.y = y;
            this.stepMax = stepMax;
        }
    }
}
