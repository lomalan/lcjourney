package dp.td;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EditDistanceTest {
    private final EditDistance editDistance = new EditDistance();
    
    
    @Test
    void test1() {
        assertEquals(3, editDistance.minDistance("horse", "ros"));
    }

    @Test
    void test2() {
        assertEquals(5, editDistance.minDistance("intention", "execution"));
    }
    
}
