package dp.td;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LIPInMatrixTest {
    private final LIPInMatrix lipInMatrix = new LIPInMatrix();
    
    @Test
    void lipMatrix1() {
        int[][] matrix = {
            {9, 9, 4},
            {6, 6, 8},
            {2, 1, 1}
        };

        assertEquals(4, lipInMatrix.longestIncreasingPath(matrix));
    }

    @Test 
    void lipMatrix2() {
        int[][] matrix = {
            {3, 4, 5},
            {3, 2, 6},
            {2, 2, 1}
        };

        assertEquals(4, lipInMatrix.longestIncreasingPath(matrix));
    }

    @Test
    void lipMatrix3() {
        int[][] matrix = {{1}};
        assertEquals(1, lipInMatrix.longestIncreasingPath(matrix));
    }
}
