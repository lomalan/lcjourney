package arraysandhashing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {
    private GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void testEmpty() {
        assertEquals(List.of(List.of("")), groupAnagrams.groupAnagrams(new String[] {""}));
    }

    @Test
    public void testOneElement() {
        assertEquals(List.of(List.of("a")), groupAnagrams.groupAnagrams(new String[] {"a"}));
    }

    @Test
    public void testGroupingMultipleElements() {
        var expectedResponse = List.of(
                List.of("bat"),
                List.of("nat", "tan"),
                List.of("ate", "eat", "tea")
        );
        var input = new String[]{"eat", "tea", "ate", "tan", "bat", "nat"};
        assertEquals(expectedResponse.size(), groupAnagrams.groupAnagrams(input).size());
    }
}
