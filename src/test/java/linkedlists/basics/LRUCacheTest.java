package linkedlists.basics;

import linkedlists.LRUCache;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LRUCacheTest {

    private LRUCache lruCache = new LRUCache(2);

    @Test
    void testLRUCache() {
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        assertEquals(1, lruCache.get(1));
        lruCache.put(3, 3);
        assertEquals(-1, lruCache.get(2));
        lruCache.put(4, 4);
        assertEquals(-1, lruCache.get(1));
        assertEquals(3, lruCache.get(3));
        lruCache.put(5, 5);
        assertEquals(-1, lruCache.get(4));
    }

    @Test
    void testLRUCacheCapacity3() {
        lruCache = new LRUCache(3);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        assertEquals(1, lruCache.get(1));
        lruCache.put(3, 3);
        lruCache.put(2, 5);
        assertEquals(5, lruCache.get(2));
        lruCache.put(4, 4);
        assertEquals(-1, lruCache.get(1));
        assertEquals(3, lruCache.get(3));
        assertEquals(4, lruCache.get(4));
    }

}
