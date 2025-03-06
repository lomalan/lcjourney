package greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class JumpGame2Test {
    private JumpGame2 jumpGame2 = new JumpGame2();

    @Test
    void testOneElement() {
        int[] jumps = {0};
        assertEquals(0, jumpGame2.minJump(jumps));
    }

    @Test
    void testMultipleElements() {
        int[] jumps = {2, 3, 1, 1, 4};
        assertEquals(2, jumpGame2.minJump(jumps));
    }

    @Test
    void testMultipleElements2() {
        int[] jumps = {2, 2, 1, 1, 4};
        assertEquals(3, jumpGame2.minJump(jumps));
    } 
    
    @Test
    void testMultipleElements3() {
        int[] jumps = {1, 2, 4, 1, 4};
        assertEquals(3, jumpGame2.minJump(jumps));
    }
    
    @Nested
    public class JumpGame2Linear {
        @Test
        void testOneElement() {
            int[] jumps = {0};
            assertEquals(0, jumpGame2.jump(jumps));
        }

        @Test
        void testMultipleElements() {
            int[] jumps = {2, 3, 1, 1, 4};
            assertEquals(2, jumpGame2.jump(jumps));
        }

        @Test
        void testMultipleElements2() {
            int[] jumps = {2, 2, 1, 1, 4};
            assertEquals(3, jumpGame2.jump(jumps));
        } 
        
        @Test
        void testMultipleElements3() {
            int[] jumps = {1, 2, 4, 1, 4};
            assertEquals(3, jumpGame2.jump(jumps));
        }   
        
    }
}
