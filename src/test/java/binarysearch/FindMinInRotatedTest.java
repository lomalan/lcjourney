package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindMinInRotatedTest {
    private final FindMinInRotated findMinInRotated = new FindMinInRotated();

    @Test
    public void test1() {
        assertEquals(1, findMinInRotated.findMin(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void test2() {
        assertEquals(0, findMinInRotated.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    @Test
    public void test3() {
        assertEquals(11, findMinInRotated.findMin(new int[]{11, 13, 15, 17}));
    }

    @Test
    public void test4() {
        assertEquals(1, findMinInRotated.findMin(new int[]{3, 1, 2}));
    }

    @Test
    public void test5() {
        assertEquals(1, findMinInRotated.findMin(new int[]{1, 2}));
    }
}