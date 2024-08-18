package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DailyTemperaturesTest {
    private final DailyTemperatures dailyTemperatures = new DailyTemperatures();

    @Test
    void test1() {
        assertArrayEquals(new int[]{1, 1, 0}, dailyTemperatures.dailyTemperatures(new int[] {30, 60, 90}));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[]{1, 1, 0, 0}, dailyTemperatures.dailyTemperatures(new int[] {30, 40, 50, 20}));
    }

    @Test
    void test3() {
        assertArrayEquals(
                new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                dailyTemperatures.dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73})
        );
    }
}
