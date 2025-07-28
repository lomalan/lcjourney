package bitop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HammingWeightTest {
    private final HammingWeight hammingWeight = new HammingWeight();



    @Test
    void test1() {
        assertEquals(3, hammingWeight.hammingWeight(11));
    }
    
    @Test
    void test2() {
        assertEquals(1, hammingWeight.hammingWeight(128));
    }
   

    @Test
    void test3() {
        assertEquals(30, hammingWeight.hammingWeight(2147483645));
    }

}
