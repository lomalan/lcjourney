package bitop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MissingNumTest {
    private MissingNum missingNum = new MissingNum();

    @Test
    void testMissingNum1() {
        int[] nums = {3, 0 , 1};
        assertEquals(2, missingNum.missingNumber(nums));
    }

    @Test
    void testMissingNum2() {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        assertEquals(8, missingNum.missingNumber(nums));
    }
}
