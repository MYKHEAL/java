package TicTacToe;
//
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
//
public class TicTacToeTest {
    private TicTacToe game;

    @BeforeEach
    public void setUp() {
        game = new TicTacToe();
    }

//    @Test
//    public void testGameStartsWithEmptyBoardAndPlayerX() {
//        assertEquals(CellValue.X, game.getCurrentPlayer(), "Game should start with player X");
//        for (int row = 0; row < 3; row++) {
//           for (int col = 0; col < 3; col++) {
//                assertTrue(game.isValidMove(row, col), "Cell (" + row + "," + col + ") should be empty");
//            }
//        }
//        assertNull(game.getGameStatus(), "Game should be ongoing at start");
//    }
//    @Test
//    public void testInitialPlayerX() {
//
//
//    }

    @Test
    public void testMakeMoveValid(){
        int row = 0, col = 0;
        boolean result = game.makeMove(row, col);
        assertTrue(result);
        assertEquals(CellValue.X, game.board[row][col]);
        assertEquals(CellValue.O,game.getCurrentPlayer());
    }

}