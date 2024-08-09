package twopointers;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {
    private final ThreeSum threeSum = new ThreeSum();

    @Test
    void noTriplets(){
        assertEquals(Collections.emptyList(), threeSum.threeSum(new int[]{0, 1, 1}));
    }

    @Test
    void oneMatch(){
        assertEquals(List.of(List.of(0, 0, 0)), threeSum.threeSum(new int[]{0, 0, 0}));
    }

    @Test
    void multipleMatches(){
        var expected = List.of(
                List.of(-1, -1, 2),
                List.of(-1, 0, 1)
        );
        assertEquals(expected, threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    @Test
    void oneMatch2(){
        var expected = List.of(
                List.of(-2, 0, 2)
        );
        assertEquals(expected, threeSum.threeSum(new int[]{-2, 0, 0, 2, 2}));
    }
}
