package bitop;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CountingBitsTest {
   private final CountingBits countingBits = new CountingBits();
   
   
   @Test
   void countBitsIn1() {
        int[] expected = {0, 1};
        assertArrayEquals(expected, countingBits.countBits(1));
   }

   @Test
   void countBitsIn2() {
        int[] expected = {0, 1, 1};
        assertArrayEquals(expected, countingBits.countBits(2));
   }

   @Test
   void countBitsIn3() {
        int[] expected = {0, 1, 1, 2};
        assertArrayEquals(expected, countingBits.countBits(3));
   }

   @Test
   void countBitsIn5() {
        int[] expected = {0, 1, 1, 2, 1, 2};
        assertArrayEquals(expected, countingBits.countBits(5));
   }

   @Nested
   class CountingBitsTestBruteForce {
        @Test
        void countBitsBruteForceIn1() {
            int[] expected = {0, 1};
            assertArrayEquals(expected, countingBits.countBitsBruteForce(1));
        }

        @Test
        void countBitsBruteForceIn2() {
            int[] expected = {0, 1, 1};
            assertArrayEquals(expected, countingBits.countBitsBruteForce(2));
        }

        @Test
        void countBitsBruteForceIn3() {
            int[] expected = {0, 1, 1, 2};
            assertArrayEquals(expected, countingBits.countBitsBruteForce(3));
        }

        @Test
        void countBitsBruteForceIn5() {
            int[] expected = {0, 1, 1, 2, 1, 2};
            assertArrayEquals(expected, countingBits.countBitsBruteForce(5));
        }

   }

}
