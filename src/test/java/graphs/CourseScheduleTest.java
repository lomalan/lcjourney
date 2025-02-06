package graphs;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseScheduleTest {
    private final CourseSchedule courseSchedule = new CourseSchedule();

    @Test
    void testCanFinishCourses() {
        assertTrue(courseSchedule.canFinish(2, new int[][] {
            {1, 0}
        }));
    }
    
    @Test
    void testCannotFinishCourses() {
        assertFalse(courseSchedule.canFinish(2, new int[][] {
            {1, 0},
            {0, 1}
        }));
    }

    @Nested
    class TopologicalCourses {
        @Test
        void testCanFinishCourses() {
            assertTrue(courseSchedule.canFinishTopologicalSort(2, new int[][] {
                    {1, 0}
            }));
        }

        @Test
        void testCannotFinishCourses() {
            assertFalse(courseSchedule.canFinishTopologicalSort(2, new int[][] {
                    {1, 0},
                    {0, 1}
            }));
        }
    }

    @Nested
    class TopologicalOrder {
        @Test
        void testCanFinishCourses() {
            int[] expected = {0, 1};
            assertArrayEquals(expected, courseSchedule.findOrder(2, new int[][] {
                    {1, 0}
            }));
        }

        @Test
        void testCannotFinishCourses() {
            assertArrayEquals(new int[0], courseSchedule.findOrder(2, new int[][] {
                    {1, 0},
                    {0, 1}
            }));
        }
    }
}
