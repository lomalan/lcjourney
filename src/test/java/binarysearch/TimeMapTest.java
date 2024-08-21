package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeMapTest {

    @Test
    void test1() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        assertEquals("bar", timeMap.get("foo", 1));
        assertEquals("bar", timeMap.get("foo", 3));

        timeMap.set("foo", "bar2", 4);

        assertEquals("bar2", timeMap.get("foo", 4));
        assertEquals("bar2", timeMap.get("foo", 5));

        assertEquals("bar", timeMap.get("foo", 2));
    }

    @Test
    void test2() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("assem", "fat", 20);
        timeMap.set("assem", "thin", 40);
        timeMap.set("hamza", "thin", 41);
        assertEquals("", timeMap.get("hamza", 20));
    }

}