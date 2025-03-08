package greedy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TripletsTest {
   private Triplets triplets = new Triplets();
   
   @Test
   void tripletsFound() {
        int[] target = {2, 7, 5};
        int[][] tripletsTest = {{2, 5 ,3}, {1, 8, 4}, {1, 7, 5}};

        assertTrue(triplets.mergeTriplets(tripletsTest, target));
   }
   
   @Test
   void tripletsNotFound() {
        int[] target = {3, 2, 5};
        int[][] tripletsTest = {{3, 4 , 5}, {4, 5, 6}};

        assertFalse(triplets.mergeTriplets(tripletsTest, target));
   }
}
