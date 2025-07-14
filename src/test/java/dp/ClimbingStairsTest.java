package dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {
    private ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    void testTwoSteps() {
        assertEquals(2, climbingStairs.climbStairs(2));
    }
    
    @Test
    void testOneStepSteps() {
        assertEquals(1, climbingStairs.climbStairs(1));
    }

    @Test
    void testThreeSteps() {
        assertEquals(3, climbingStairs.climbStairs(3));
    }

    @Test
    void testFourSteps() {
        assertEquals(5, climbingStairs.climbStairs(4));
    }

    @Nested
    public class InnerClimbingStairsTestRec {
        
        @Test
        void testTwoSteps() {
            assertEquals(2, climbingStairs.climbStairsRec(2));
        }
        
        @Test
        void testOneStepSteps() {
            assertEquals(1, climbingStairs.climbStairsRec(1));
        }

        @Test
        void testThreeSteps() {
            assertEquals(3, climbingStairs.climbStairsRec(3));
        }

        @Test
        void testFourSteps() {
            assertEquals(5, climbingStairs.climbStairsRec(4));
        }
        
    }
}
