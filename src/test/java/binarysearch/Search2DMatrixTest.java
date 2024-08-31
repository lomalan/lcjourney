package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Search2DMatrixTest {
    private final Search2DMatrix search2DMatrix = new Search2DMatrix();

    int[][] matrix = new int[][]{
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
    };

    @Test
    public void testElementNotFound() {
        assertFalse(search2DMatrix.searchMatrix(matrix, 13));
    }

    @Test
    public void testElementFound() {
        assertTrue(search2DMatrix.searchMatrix(matrix, 5));
    }

    @Test
    public void testElementFoundInTheEnd() {
        assertTrue(search2DMatrix.searchMatrix(matrix, 60));
    }
}