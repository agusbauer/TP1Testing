package threes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class BranchCoverage {
	
	@Test(timeout = 2000)
    public void emptyTilesBetweentwoRows() {
        ThreesBoard board = new ThreesBoard(); 
        for (int i = 0; i < ThreesBoard.ROWS; i++) {
            for (int j = 0; j < ThreesBoard.COLUMNS; j++) {
                board.set_tile(i, j, 1); 
            }
        }
        board.set_tile(2,0, 0);
        board.set_tile(2,1, 0);
        board.set_tile(2,2, 0);
        //System.out.println(board);
        ThreesController threes = new ThreesController(board);
        threes.move_up();
        //System.out.println(threes.getBoard());
        assertTrue(threes.getBoard().get_tile(2, 0).getValue() == 1);
        assertTrue(threes.getBoard().get_tile(2, 1).getValue() == 1);
        assertTrue(threes.getBoard().get_tile(2, 2).getValue() == 1);     
    }

	@Test//(timeout = 2000)
    public void secondRowWithFreeTile() {
        ThreesBoard board = new ThreesBoard(); 
        for (int i = 0; i < ThreesBoard.ROWS; i++) {
            for (int j = 0; j < ThreesBoard.COLUMNS; j++) {
                board.set_tile(i, j, 1); 
            }
        }
        board.set_tile(1,2,0);
        board.set_tile(1,1,0);
        board.set_tile(1,3,0);
        board.set_tile(0, 0, 2);
        //System.out.println(board);
        ThreesController threes = new ThreesController(board);
        threes.move_up();
       // System.out.println(threes.getBoard());
        assertTrue(threes.getBoard().get_tile(0, 0).getValue() == 3);
        assertTrue(threes.getBoard().get_tile(1, 1).getValue() == 1);
        assertTrue(threes.getBoard().get_tile(1, 2).getValue() == 1);
        assertTrue(threes.getBoard().get_tile(1, 3).getValue() == 1);
    }
}
