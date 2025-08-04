package bitop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseBitsTest {
    private ReverseBits reverseBits = new ReverseBits();


    @Test
    void testReverse1() {
        assertEquals(964176192, reverseBits.reverseBits(43261596));
        assertEquals(1073741822, reverseBits.reverseBits(2147483644));
    }
    
}
