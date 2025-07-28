package bitop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SingleNumTest {
   private SingleNum singleNum = new SingleNum();
   
   @Test
   void testEmptyNums() {
        int[] nums = {};
        assertEquals(0, singleNum.singleNumber(nums));
   }

   @Test
   void testThreeNums() {
        int[] nums = {2, 2, 1};
        assertEquals(1, singleNum.singleNumber(nums));
   }

   @Test
   void testFiveNums() {
        int[] nums = {4, 1, 5, 1, 4};
        assertEquals(5, singleNum.singleNumber(nums));
   }

}
