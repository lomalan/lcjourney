package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KokoTest {
    private final Koko koko = new Koko();

    @Test
    public void test1() {
        assertEquals(4, koko.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }

    @Test
    public void test2() {
        assertEquals(30, koko.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
    }

    @Test
    public void test3() {
        assertEquals(23, koko.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }

}