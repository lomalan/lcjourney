package greedy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class JumpGameTest {
    private JumpGame jumpGame = new JumpGame();

    @Test
    void canJump() {
        int[] jumps = {2, 3, 1, 1, 4};
        assertTrue(jumpGame.canJump(jumps));
    }

    @Test
    void cannotJump() {
        int[] jumps = {3, 2, 1, 0, 4};
        assertFalse(jumpGame.canJump(jumps));
    }

    @Test
    void canJumpWithOneElement() {
        int[] jumps = {0};
        assertTrue(jumpGame.canJump(jumps));
    }
    
    @Test
    void cannotJumpWhenStartsWithZero() {
        int[] jumps = {0, 2, 3};
        assertFalse(jumpGame.canJump(jumps));
    }

    @Test
    void cannotJumpIfreachesZero() {
        int[] jumps = {1, 0, 1, 0};
        assertFalse(jumpGame.canJump(jumps));
    }

    @Test
    void canJumpAnotherCase() {
        int[] jumps = {1, 1, 1, 0};
        assertTrue(jumpGame.canJump(jumps));
    }

    @Nested
    public class AnotherJumpGameTest {
    
        @Test
        void canJump() {
            int[] jumps = {2, 3, 1, 1, 4};
            assertTrue(jumpGame.canJumpAnother(jumps));
        }

        @Test
        void cannotJump() {
            int[] jumps = {3, 2, 1, 0, 4};
            assertFalse(jumpGame.canJumpAnother(jumps));
        }

        @Test
        void canJumpWithOneElement() {
            int[] jumps = {0};
            assertTrue(jumpGame.canJumpAnother(jumps));
        }
        
        @Test
        void cannotJumpWhenStartsWithZero() {
            int[] jumps = {0, 2, 3};
            assertFalse(jumpGame.canJumpAnother(jumps));
        }

        @Test
        void cannotJumpIfreachesZero() {
            int[] jumps = {1, 0, 1, 0};
            assertFalse(jumpGame.canJumpAnother(jumps));
        }

        @Test
        void canJumpAnotherCase() {
            int[] jumps = {1, 1, 1, 0};
            assertTrue(jumpGame.canJumpAnother(jumps));
        }   
    }
}
