package graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheapestFlightsTest {
    private final CheapestFlights cheapestFlights = new CheapestFlights();

    @Test
    void trickyCase() {
        int[][] flights = {{0, 1, 5}, {1, 2, 5}, {0, 3, 2}, {3, 1, 2}, {1, 4, 1}, {4, 2, 1}};
        assertEquals(7, cheapestFlights.findCheapestPrice(5, flights, 0, 2, 2));
    }
    @Test
    void testZeroStops() {
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        assertEquals(500, cheapestFlights.findCheapestPrice(3, flights, 0, 2, 0));
    }
    @Test
    void testOneStop() {
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        assertEquals(700, cheapestFlights.findCheapestPrice(4, flights, 0, 3, 1));
    }
    @Test
    void testTwoStops() {
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        assertEquals(400, cheapestFlights.findCheapestPrice(4, flights, 0, 3, 2));
    }
    @Test
    void testOneStop2() {
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        assertEquals(200, cheapestFlights.findCheapestPrice(3, flights, 0, 2, 1));
    }
}