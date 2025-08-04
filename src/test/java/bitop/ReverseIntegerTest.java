package bitop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {
    private ReverseInteger reverseInteger = new ReverseInteger();
   
    @Test
    void testPositiveNumber() {
        assertEquals(123, reverseInteger.reverse(321));
    }

    @Test
    void testNegativeNumber() {
        assertEquals(-123, reverseInteger.reverse(-321));
    }

    @Test
    void testWithtrailingZero() {
        assertEquals(12, reverseInteger.reverse(210));
    }

    @Test
    void testOverflow() {
        assertEquals(0, reverseInteger.reverse(1534236469));
    }

    @Nested
    class TestLongReverse {
        @Test
        void testPositiveNumber() {
            assertEquals(123, reverseInteger.reverseWithLong(321));
        }

        @Test
        void testNegativeNumber() {
            assertEquals(-123, reverseInteger.reverseWithLong(-321));
        }

        @Test
        void testWithtrailingZero() {
            assertEquals(12, reverseInteger.reverseWithLong(210));
        }

        @Test
        void testOverflow() {
            assertEquals(0, reverseInteger.reverseWithLong(1534236469));
        }

       
    }
}
