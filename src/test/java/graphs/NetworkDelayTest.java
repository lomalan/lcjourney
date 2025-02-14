package graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NetworkDelayTest {
    private final NetworkDelay networkDelay = new NetworkDelay();

    @Test
    void multipleNodes() {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        assertEquals(2, networkDelay.networkDelayTime(times, 4, 2));
    }

    @Test
    void oneNode() {
        int[][] times = {{1, 2, 1}};
        assertEquals(1, networkDelay.networkDelayTime(times, 2, 1));
    }

    @Test
    void noPossibleDelay() {
        int[][] times = {{1, 2, 1}};
        assertEquals(-1, networkDelay.networkDelayTime(times, 2, 2));
    }

}