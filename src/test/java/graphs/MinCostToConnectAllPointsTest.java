package graphs;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostToConnectAllPointsTest {
    private final MinCostToConnectAllPoints minCostToConnectAllPoints = new MinCostToConnectAllPoints();

    @Test
    void test1() {
        int[][] points = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        assertEquals(20, minCostToConnectAllPoints.minCostConnectPoints(points));
    }

    @Test
    void test2() {
        int[][] points = {{3, 12}, {-2, 5}, {-4, 1}};
        assertEquals(18, minCostToConnectAllPoints.minCostConnectPoints(points));
    }

    @Nested
    class Optimal {
        @Test
        void test1() {
            int[][] points = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
            assertEquals(20, minCostToConnectAllPoints.minCostOptimal(points));
        }

        @Test
        void test2() {
            int[][] points = {{3, 12}, {-2, 5}, {-4, 1}};
            assertEquals(18, minCostToConnectAllPoints.minCostOptimal(points));
        }
    }
}