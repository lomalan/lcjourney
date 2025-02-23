package graphs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ReconstructItineraryTest {
    private final ReconstructItinerary reconstructItinerary = new ReconstructItinerary();

    @Test
    void reconstructSimplePath() {
        List<List<String>> tickets = new ArrayList<>(List.of(
            new ArrayList<>(List.of("MUC", "LHR")),
            new ArrayList<>( List.of("JFK", "MUC")),
            new ArrayList<>(List.of("SFO", "SJC")),
            new ArrayList<>(List.of("LHR", "SFO"))
        ));
        var expected = List.of("JFK", "MUC", "LHR", "SFO", "SJC");
        assertEquals(expected, reconstructItinerary.findItinerary(tickets));
    }
    
    @Test
    void reconstructComplexPath() {
        List<List<String>> tickets = new ArrayList<>(List.of(
            new ArrayList<>(List.of("JFK", "SFO")),
            new ArrayList<>(List.of("JFK", "ATL")),
            new ArrayList<>(List.of("SFO", "ATL")),
            new ArrayList<>(List.of("ATL", "JFK")),
            new ArrayList<>(List.of("ATL", "SFO"))
        ));
        var expected = List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
        assertEquals(expected, reconstructItinerary.findItinerary(tickets));
    }

    @Nested
    class Optimal {
        @Test
        void reconstructSimplePath() {
            List<List<String>> tickets = new ArrayList<>(List.of(
                new ArrayList<>(List.of("MUC", "LHR")),
                new ArrayList<>( List.of("JFK", "MUC")),
                new ArrayList<>(List.of("SFO", "SJC")),
                new ArrayList<>(List.of("LHR", "SFO"))
            ));
            var expected = List.of("JFK", "MUC", "LHR", "SFO", "SJC");
            assertEquals(expected, reconstructItinerary.itineraryOptimal(tickets));
        }
        
        @Test
        void reconstructComplexPath() {
            List<List<String>> tickets = new ArrayList<>(List.of(
                new ArrayList<>(List.of("JFK", "SFO")),
                new ArrayList<>(List.of("JFK", "ATL")),
                new ArrayList<>(List.of("SFO", "ATL")),
                new ArrayList<>(List.of("ATL", "JFK")),
                new ArrayList<>(List.of("ATL", "SFO"))
            ));
            var expected = List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
            assertEquals(expected, reconstructItinerary.itineraryOptimal(tickets));
        }

       
    }
}
