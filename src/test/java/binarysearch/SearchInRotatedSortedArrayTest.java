package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();

    int[] nums = new int[] {4, 5, 6, 7, 0, 1, 2};

    @Test
    public void searchNonExistingInRotated() {
        assertEquals(-1, search.search(nums, 10));
    }

    @Test
    public void searchRotatedInTheEnd() {
        assertEquals(6, search.search(nums, 2));
    }

    @Test
    public void searchRotatedInTheStart() {
        assertEquals(0, search.search(nums, 4));
    }

    @Test
    public void searchRotated1() {
        assertEquals(1, search.search(nums, 5));
    }

    @Test
    public void searchRotated2() {
        assertEquals(2, search.search(nums, 6));
    }

    @Test
    public void searchRotated3() {
        assertEquals(3, search.search(nums, 7));
    }

    @Test
    public void searchRotated4() {
        assertEquals(4, search.search(nums, 0));
    }

    @Test
    public void searchRotated5() {
        assertEquals(5, search.search(nums, 1));
    }

    @Test
    public void searchRotated8() {
        assertEquals(4, search.search(new int[] {4,5,6,7,8,1,2,3}, 8));
    }
}