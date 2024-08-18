package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void test1() {
        assertEquals(4, binarySearch.search(new int[] {-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    void test2() {
        assertEquals(-1, binarySearch.search(new int[] {-1, 0, 3, 5, 9, 12}, 2));
    }

    @Test
    void test3() {
        assertEquals(0, binarySearch.search(new int[] {-1, 0, 3, 5, 9, 12}, -1));
    }

    @Test
    void test4() {
        assertEquals(5, binarySearch.search(new int[] {-1, 0, 3, 5, 9, 12}, 12));
    }

    @Test
    void test5() {
        assertEquals(2, binarySearch.search(new int[] {-1, 0, 3, 5, 9, 12}, 3));
    }
}
