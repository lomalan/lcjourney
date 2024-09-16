package heaps;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosest {

    public int[][] kClosestComparator(int[][] points, int k) {
        if (points.length == k) {
            return points;
        }
        // Phase 1. Create priority queue, calculate distance and add it with point to the current queue
        PriorityQueue<int[]> distances = new PriorityQueue<>((
                Comparator.comparingInt(point -> point[0] * point[0] + point[1] * point[1])
        ));
        Collections.addAll(distances, points);

        // Phase 3. populate result
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = distances.poll();
        }
        return result;
    }

    public int[][] kClosest(int[][] points, int k) {
        if (points.length == k) {
            return points;
        }
        // Phase 1. Create priority queue, calculate distance and add it with point to the current queue
        PriorityQueue<Distance> distances = new PriorityQueue<>();
        for (int[] point: points) {
            var x = point[0];
            var y = point[1];
            var euclidianDistance = x * x + y * y;
            distances.add(new Distance(euclidianDistance, point));
        }

        // Phase 3. populate result
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i] = distances.poll().point;
        }
        return result;
    }

    private class Distance implements Comparable<Distance> {

        final Integer distance;
        final int[] point;

        public Distance(Integer distance, int[] point) {
            this.distance = distance;
            this.point = point;
        }

        @Override
        public int compareTo(Distance aDistance) {
            return Integer.compare(distance, aDistance.distance);
        }
    }
}
