package greedy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HandOfStraightsTest {
    private HandOfStraights handOfStraights = new HandOfStraights();

    @Test
    void groupSizeDoNotmatch() {
        int[] hand = {1, 2, 3, 4, 5};
        assertFalse(handOfStraights.isNStraightHand(hand, 4));
    }
    
    @Test
    void notAStraight() {
        int[] hand = {1, 5, 2, 3, 3};
        assertFalse(handOfStraights.isNStraightHand(hand, 5));
    }
    
    @Test
    void validStraight() {
        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        assertTrue(handOfStraights.isNStraightHand(hand, 3));
    }

}
