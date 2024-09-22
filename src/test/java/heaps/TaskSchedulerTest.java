package heaps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TaskSchedulerTest {

    private final TaskScheduler taskScheduler = new TaskScheduler();

    @Nested
    public class PriorityQueue {

        @Test
        public void testWithCoolingTime1() {
            char[] tasks = new char[] { 'A', 'C', 'A', 'B', 'D', 'B' };
            assertEquals(6, taskScheduler.leastInterval(tasks, 1));
        }

        @Test
        public void testWithCoolingTime2() {
            char[] tasks = new char[] { 'A', 'A', 'A', 'B', 'B', 'B' };
            assertEquals(8, taskScheduler.leastInterval(tasks, 2));
        }

        @Test
        public void testWithCoolingTime3() {
            char[] tasks = new char[] { 'A', 'A', 'A', 'B', 'B', 'B' };
            assertEquals(10, taskScheduler.leastInterval(tasks, 3));
        }
    }

    @Nested
    public class GreedyTests {

        @Test
        public void testWithCoolingTime1() {
            char[] tasks = new char[] { 'A', 'C', 'A', 'B', 'D', 'B' };
            assertEquals(6, taskScheduler.leastIntervalGreedy(tasks, 1));
        }

        @Test
        public void testWithCoolingTime2() {
            char[] tasks = new char[] { 'A', 'A', 'A', 'B', 'B', 'B' };
            assertEquals(8, taskScheduler.leastIntervalGreedy(tasks, 2));
        }

        @Test
        public void testWithCoolingTime3() {
            char[] tasks = new char[] { 'A', 'A', 'A', 'B', 'B', 'B' };
            assertEquals(10, taskScheduler.leastIntervalGreedy(tasks, 3));
        }
    }
}
