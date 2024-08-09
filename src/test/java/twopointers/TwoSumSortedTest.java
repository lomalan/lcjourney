package twopointers;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumSortedTest {
    private final TwoSumSorted twoSumSorted = new TwoSumSorted();

    int[] testArr1 = new int[]{2,7,11,15};
    int[] testArr2 = new int[]{2,3,4};
    int[] testArr3 = new int[]{-1, 0};

    @Nested
    class Standard {
        @Test
        void test1() {
            assertArrayEquals(new int[]{1, 2}, twoSumSorted.twoSum(testArr1, 9));
        }

        @Test
        void test2() {
            assertArrayEquals(new int[]{1, 4}, twoSumSorted.twoSum(testArr1, 17));
        }

        @Test
        void test3() {
            assertArrayEquals(new int[]{2, 4}, twoSumSorted.twoSum(testArr1, 22));
        }

        @Test
        void test4() {
            assertArrayEquals(new int[]{2, 3}, twoSumSorted.twoSum(testArr1, 18));
        }

        @Test
        void test5() {
            assertArrayEquals(new int[]{1, 2}, twoSumSorted.twoSum(testArr1, 9));
        }

        @Test
        void test6() {
            assertArrayEquals(new int[]{1, 3}, twoSumSorted.twoSum(testArr2, 6));
        }

        @Test
        void test7() {
            assertArrayEquals(new int[]{1, 2}, twoSumSorted.twoSum(testArr2, 5));
        }

        @Test
        void test8() {
            assertArrayEquals(new int[]{1, 2}, twoSumSorted.twoSum(testArr3, -1));
        }
    }

    @Nested
    class NonStandard {
        @Test
        void test1() {
            assertArrayEquals(new int[]{1, 2}, twoSumSorted.twoSumNonStandard(testArr1, 9));
        }

        @Test
        void test2() {
            assertArrayEquals(new int[]{1, 4}, twoSumSorted.twoSumNonStandard(testArr1, 17));
        }

        @Test
        void test3() {
            assertArrayEquals(new int[]{2, 4}, twoSumSorted.twoSumNonStandard(testArr1, 22));
        }

        @Test
        void test4() {
            assertArrayEquals(new int[]{2, 3}, twoSumSorted.twoSumNonStandard(testArr1, 18));
        }

        @Test
        void test5() {
            assertArrayEquals(new int[]{1, 2}, twoSumSorted.twoSumNonStandard(testArr1, 9));
        }

        @Test
        void test6() {
            assertArrayEquals(new int[]{1, 3}, twoSumSorted.twoSumNonStandard(testArr2, 6));
        }

        @Test
        void test7() {
            assertArrayEquals(new int[]{1, 2}, twoSumSorted.twoSumNonStandard(testArr2, 5));
        }

        @Test
        void test8() {
            assertArrayEquals(new int[]{1, 2}, twoSumSorted.twoSumNonStandard(testArr3, -1));
        }
    }
}
