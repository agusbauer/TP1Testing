package threes;

import static org.junit.Assert.*;

import org.junit.Test;

public class MutantTests {

	@Test
	public void test() {
		ThreesBoard board = new ThreesBoard(); 
        
        board.set_tile(3,0, 0);
        board.set_tile(3,1, 0);
        board.set_tile(3,2, 0);
        board.set_tile(3,3, 3);
        
        board.set_tile(2,0, 0);
        board.set_tile(2,1, 0);
        board.set_tile(2,2, 0);
        board.set_tile(2,3, 3);
        
        board.set_tile(1,0, 1);
        board.set_tile(1,1, 0);
        board.set_tile(1,2, 0);
        board.set_tile(1,3, 6);
        
        board.set_tile(0,0, 0);
        board.set_tile(0,1, 0);
        board.set_tile(0,2, 0);
        board.set_tile(0,3, 12);
        System.out.println(board);
        ThreesController threes = new ThreesController(board.clone());
        threes.move_up();
        System.out.println(threes.getBoard());
        assertTrue(threes.getBoard().get_tile(0, 3).getValue() == 12);
        assertTrue(threes.getBoard().get_tile(1, 3).getValue() == 6);
        assertTrue(threes.getBoard().get_tile(2, 3).getValue() == 6);
        assertTrue(threes.getBoard().get_tile(0, 0).getValue() == 1);
        assertTrue(threes.getBoard().get_tile(1, 0).getValue() == 0); 
        assertTrue((threes.getBoard().get_tile(3, 3).getValue() != 0 && threes.getBoard().get_tile(3, 0).getValue() == 0) ||
        		(threes.getBoard().get_tile(3, 3).getValue() == 0 && threes.getBoard().get_tile(3, 0).getValue() != 0));
        /*assertTrue(threes.getBoard().get_tile(2, 0).getValue() == 1);
        assertTrue(threes.getBoard().get_tile(2, 2).getValue() == 1);
        assertTrue(threes.getBoard().get_tile(2, 3).getValue() == 1);
        assertTrue(threes.getBoard().get_tile(2, 1).getValue() == 1);
        assertTrue((threes.getBoard().get_tile(3, 0).getValue() == 0 && threes.getBoard().get_tile(3, 1).getValue() != 0 ) ||
        		(threes.getBoard().get_tile(3, 0).getValue() != 0 && threes.getBoard().get_tile(3, 1).getValue() == 0 ));
	*/}

}
