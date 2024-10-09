package backtrack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class NQueensTest {
   private final NQueens nQueens = new NQueens();
   
   @Test
   void test1x1Board() {
        assertEquals(List.of(List.of("Q")), nQueens.solveNQueens(1));
   }
   
   @Test
   void test4x4Board() {
        assertEquals(List.of(
            List.of("..Q., Q..., ...Q, .Q.."),
            List.of(".Q.., ...Q, Q..., ..Q.")
            ), nQueens.solveNQueens(4));
   }

}
