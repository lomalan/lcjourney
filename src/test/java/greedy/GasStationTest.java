package greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GasStationTest {
    private final GasStation gasStation = new GasStation();

    @Test
    void pathFound() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        assertEquals(3, gasStation.canCompleteCircuit(gas, cost));
    }
    
    @Test
    void pathNotFound() {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        assertEquals(-1, gasStation.canCompleteCircuit(gas, cost));
    }

}
