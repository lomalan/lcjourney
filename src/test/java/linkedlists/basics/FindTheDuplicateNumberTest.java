package linkedlists.basics;

import linkedlists.FindTheDuplicateNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDuplicateNumberTest {

    private final FindTheDuplicateNumber findTheDuplicateNumber = new FindTheDuplicateNumber();

    @Test
    void findDuplicate1() {
        var array = new int[] {1, 3, 4, 2, 2};
        var result = findTheDuplicateNumber.findDuplicate(array);
        assertEquals(result, 2);
    }

    @Test
    void findDuplicate2() {
        var array = new int[] {3, 1, 3, 4, 2};
        var result = findTheDuplicateNumber.findDuplicate(array);
        assertEquals(result, 3);
    }

    @Test
    void findDuplicate3() {
        var array = new int[] {3, 3, 3, 3, 3};
        var result = findTheDuplicateNumber.findDuplicate(array);
        assertEquals(result, 3);
    }
}
