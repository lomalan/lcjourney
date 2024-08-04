package arraysandhashing;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringEncodeDecodeTest {
    private final StringEncodeDecode stringEncodeDecode = new StringEncodeDecode();

    String encoded1 = "4£neet4£code4£love3£you";
    List<String> decoded1 = Arrays.asList("neet", "code", "love", "you");

    String encoded2 = "2£we3£say1£:3£yes";
    List<String> decoded2 = Arrays.asList("we", "say", ":", "yes");

    @Nested
    class Encode {
        @Test
        void test1() {
            assertEquals(encoded1, stringEncodeDecode.encode(decoded1));
        }

        @Test
        void test2() {
            assertEquals(encoded2, stringEncodeDecode.encode(decoded2));
        }
    }

    @Nested
    class Decode {
        @Test
        void test1() {
            assertEquals(decoded1, stringEncodeDecode.decode(encoded1));
        }

        @Test
        void test2() {
            assertEquals(decoded2, stringEncodeDecode.decode(encoded2));
        }
    }
}
