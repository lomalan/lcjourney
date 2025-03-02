package greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxSubArrayTest {
    private final MaxSubArray maxSubArray = new MaxSubArray();


    @Test
    void testOneElement() {
        int[] array = {1};
        assertEquals(1, maxSubArray.maxSubArray(array));
    }
    
    @Test
    void testMultipleElements() {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, maxSubArray.maxSubArray(array));
    } 
    
    @Test
    void testWholeArrayCase() {
        int[] array = {5, 4, -1, 7, 8};
        assertEquals(23, maxSubArray.maxSubArray(array));
    }

    @Test
    void testNegativeValue() {
        int[] array = {-1};
        assertEquals(-1, maxSubArray.maxSubArray(array));
    }


}
