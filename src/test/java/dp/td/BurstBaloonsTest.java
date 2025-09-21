package dp.td;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BurstBaloonsTest {
    private final BurstBaloons burstBaloons = new BurstBaloons();



    @Test
    void test1() {
        assertEquals(167, burstBaloons.maxCoins(new int[] {3, 1, 5, 8}));
    }

    @Test
    void test2() {
        assertEquals(10, burstBaloons.maxCoins(new int[]{1, 5}));
    }
}
