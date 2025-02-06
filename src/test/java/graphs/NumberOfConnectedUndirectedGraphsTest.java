package graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfConnectedUndirectedGraphsTest {
    private final NumberOfConnectedUndirectedGraphs testObject = new NumberOfConnectedUndirectedGraphs();

    @Test
    void oneGraph() {
        int[][] graphs = {{0, 1}, {0, 2}};
        assertEquals(1, testObject.countComponents(3, graphs));
    }
    @Test
    void twoGraphs() {
        int[][] graphs = {{0, 1}, {0, 2}, {2, 3}, {4, 5}};
        assertEquals(2, testObject.countComponents(6, graphs));
    }
}