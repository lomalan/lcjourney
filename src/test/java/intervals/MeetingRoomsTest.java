package intervals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class MeetingRoomsTest {
    private MeetingRooms meetingRooms = new MeetingRooms();

    @Nested
    public class CanAttendMeetings {

        @Test
        void canNotAttendMeetings() {
            assertFalse(meetingRooms.canAttendMeetings(new ArrayList<>(List.of(
                new Interval(0, 30),
                new Interval(5, 10),
                new Interval(15, 20)
            ))));
        }

        @Test
        void canAttendMeetings() {
            assertTrue(meetingRooms.canAttendMeetings(new ArrayList<>(List.of(
                new Interval(5, 8),
                new Interval(9, 15)
            ))));
        }
        
    }
    @Nested
    public class MinMeetingRooms {
        @Test
        void twoSeparateMeetingRooms() {
            assertEquals(2, meetingRooms.minMeetingRooms(List.of(
                new Interval(0, 40),
                new Interval(5, 10),
                new Interval(15, 20)
            )));
        }
    
        @Test
        void oneMeetingRoom() {
            assertEquals(1, meetingRooms.minMeetingRooms(List.of(
                new Interval(5, 10),
                new Interval(15, 20)
            )));
        }
        
    }
    
}
