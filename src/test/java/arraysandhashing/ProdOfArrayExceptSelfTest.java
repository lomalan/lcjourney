package arraysandhashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProdOfArrayExceptSelfTest {
    private final ProdOfArrayExceptSelf prodOfArrayExceptSelf = new ProdOfArrayExceptSelf();

    @Test
    void oneElementProduct() {
        var result = prodOfArrayExceptSelf.productExceptSelf(new int[] {1});
        assertArrayEquals(new int[] {1}, result);
    }

    @Test
    void multipleElementProduct_1() {
        var result = prodOfArrayExceptSelf.productExceptSelf(new int[] {1, 2, 3, 4});
        assertArrayEquals(new int[] {24, 12, 8, 6}, result);
    }

    @Test
    void multipleElementProduct_2() {
        var result = prodOfArrayExceptSelf.productExceptSelf(new int[] {0, 2, 3, 5});
        assertArrayEquals(new int[] {30, 0, 0, 0}, result);
    }

    @Test
    void multipleElementProduct_3() {
        var result = prodOfArrayExceptSelf.productExceptSelf(new int[] {-1, 1, 0, -3, 3});
        assertArrayEquals(new int[] {0, 0, 9, 0, 0}, result);
    }
}
