package graphs;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedundantConnectionTest {
    private final RedundantConnection redundantConnection = new RedundantConnection();
    @Test
    void test1() {
        int[][] edges = {{1, 2}, {1, 3}, {2, 3}};
        assertArrayEquals(new int[]{2, 3}, redundantConnection.findRedundantConnection(edges));
    }

    @Test
    void test2() {
        int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        assertArrayEquals(new int[]{1, 4}, redundantConnection.findRedundantConnection(edges));
    }

    @Nested
    class UnionFind {
        @Test
        void test1() {
            int[][] edges = {{1, 2}, {1, 3}, {2, 3}};
            assertArrayEquals(new int[]{2, 3}, redundantConnection.redundantConnectionUnion(edges));
        }

        @Test
        void test2() {
            int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
            assertArrayEquals(new int[]{1, 4}, redundantConnection.redundantConnectionUnion(edges));
        }
    }
}