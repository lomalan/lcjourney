package heaps;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KClosestTest {

    private final KClosest kClosest = new KClosest();

    @Nested
    class KClosestComparable {
        @Test
        void test1() {
            int[][] result = {{-2, 2}};
            int[][] points = {{1, 3}, {-2, 2}};
            assertArrayEquals(result, kClosest.kClosest(points, 1));
        }

        @Test
        void test2() {
            int[][] points = {{1, 3}, {-2, 2}};
            assertArrayEquals(points, kClosest.kClosest(points, 2));
        }

        @Test
        void test3() {
            int[][] result = {{3, 3}, {-2, 4}};
            int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
            assertArrayEquals(result, kClosest.kClosest(points, 2));
        }
    }

    @Nested
    class KClosestComparator {
        @Test
        void test1() {
            int[][] result = {{-2, 2}};
            int[][] points = {{1, 3}, {-2, 2}};
            assertArrayEquals(result, kClosest.kClosestComparator(points, 1));
        }

        @Test
        void test2() {
            int[][] points = {{1, 3}, {-2, 2}};
            assertArrayEquals(points, kClosest.kClosestComparator(points, 2));
        }

        @Test
        void test3() {
            int[][] result = {{3, 3}, {-2, 4}};
            int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
            assertArrayEquals(result, kClosest.kClosestComparator(points, 2));
        }
    }
}