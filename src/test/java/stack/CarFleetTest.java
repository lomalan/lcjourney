package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFleetTest {
    private final CarFleet carFleet = new CarFleet();

    @Test
    void testEmpty() {
        assertEquals(0, carFleet.carFleet(
                0,
                new int[] {},
                new int[] { })
        );
    }
    @Test
    void test1() {
        assertEquals(3, carFleet.carFleet(
                12,
                new int[] {10, 8, 0, 5, 3},
                new int[] {2, 4, 1, 1, 3})
        );
    }

    @Test
    void test2() {
        assertEquals(1, carFleet.carFleet(
                10,
                new int[] {3},
                new int[] {3})
        );
    }

    @Test
    void test3() {
        assertEquals(1, carFleet.carFleet(
                100,
                new int[] {0, 2, 4},
                new int[] {4, 2, 1})
        );
    }
}
