package threes;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoveMethodsTests {

	
	@Test
	public void onlyMoveUpTest() {
		ThreesBoard board = new ThreesBoard(); 
        
        board.set_tile(0,0, 1);
        board.set_tile(0,1, 1);
        board.set_tile(0,2, 1);
        board.set_tile(0,3, 1);
        
        board.set_tile(1,0, 2);
        board.set_tile(1,1, 2);
        board.set_tile(1,2, 0);
        board.set_tile(1,3, 3);
        
        board.set_tile(2,0, 3);
        board.set_tile(2,1, 3);
        board.set_tile(2,2, 0);
        board.set_tile(2,3, 0);
        
        board.set_tile(3,0, 3);
        board.set_tile(3,1, 3);
        board.set_tile(3,2, 0);
        board.set_tile(3,3, 0);
        //System.out.println(board);
        ThreesController threes = new ThreesController(board);
        threes.move_up();
        //System.out.println(threes.getBoard());
        assertTrue(threes.getBoard().get_tile(0, 0).getValue() == 3);
        assertTrue(threes.getBoard().get_tile(0, 1).getValue() == 3);
        assertTrue(threes.getBoard().get_tile(1, 0).getValue() == 3);     
        assertTrue(threes.getBoard().get_tile(1, 1).getValue() == 3);
        assertTrue(threes.getBoard().get_tile(2, 0).getValue() == 3);
        assertTrue(threes.getBoard().get_tile(2, 1).getValue() == 3);
        assertTrue((threes.getBoard().get_tile(3, 0).getValue() == 0 && threes.getBoard().get_tile(3, 1).getValue() != 0 ) ||
        		(threes.getBoard().get_tile(3, 0).getValue() != 0 && threes.getBoard().get_tile(3, 1).getValue() == 0 ));
	}
	
	@Test
	public void moveUpAndRightTest() {
		ThreesBoard board = new ThreesBoard(); 
        
        board.set_tile(0,0, 3);
        board.set_tile(0,1, 1);
        board.set_tile(0,2, 1);
        board.set_tile(0,3, 1);
        
        board.set_tile(1,0, 2);
        board.set_tile(1,1, 1);
        board.set_tile(1,2, 6);
        board.set_tile(1,3, 3);
        
        board.set_tile(2,0, 0);
        board.set_tile(2,1, 0);
        board.set_tile(2,2, 0);
        board.set_tile(2,3, 3);
        //System.out.println(board);
        ThreesController threes = new ThreesController(board);
        threes.move_up();
        threes.move_right();
        //System.out.println(threes.getBoard());
        assertTrue(threes.getBoard().get_tile(1, 2).getValue() == 1);
        assertTrue(threes.getBoard().get_tile(1, 3).getValue() == 12);
        assertTrue(threes.getBoard().get_tile(1, 0).getValue() != 0);     
        assertTrue(threes.getBoard().get_tile(3, 3).getValue() != 0);  
	}
	

	@Test
	public void moveUpAndLeftTest() {
		ThreesBoard board = new ThreesBoard(); 
        
        board.set_tile(0,0, 3);
        board.set_tile(0,1, 1);
        board.set_tile(0,2, 1);
        board.set_tile(0,3, 1);
        
        board.set_tile(1,0, 2);
        board.set_tile(1,1, 1);
        board.set_tile(1,2, 6);
        board.set_tile(1,3, 3);
        
        board.set_tile(2,0, 0);
        board.set_tile(2,1, 0);
        board.set_tile(2,2, 0);
        board.set_tile(2,3, 3);
        //System.out.println(board);
        ThreesController threes = new ThreesController(board);
        threes.move_up();
        //System.out.println(threes.getBoard());
        threes.move_left();
        //System.out.println(threes.getBoard());
        assertTrue(threes.getBoard().get_tile(1, 0).getValue() == 3);
        assertTrue(threes.getBoard().get_tile(1, 1).getValue() == 6);
        assertTrue(threes.getBoard().get_tile(1, 2).getValue() == 6);     
        assertTrue(threes.getBoard().get_tile(3, 2).getValue() != 0);  
        assertTrue((threes.getBoard().get_tile(1, 3).getValue() != 0 && threes.getBoard().get_tile(3, 3).getValue() == 0) ||
        		(threes.getBoard().get_tile(1, 3).getValue() == 0 && threes.getBoard().get_tile(3, 3).getValue() != 0));   
	}
	
	@Test
	public void onlyMoveDownTest() {
		ThreesBoard board = new ThreesBoard(); 
        
        board.set_tile(3,0, 1);
        board.set_tile(3,1, 1);
        board.set_tile(3,2, 1);
        board.set_tile(3,3, 1);
        
        board.set_tile(2,0, 2);
        board.set_tile(2,1, 2);
        board.set_tile(2,2, 0);
        board.set_tile(2,3, 3);
        
        board.set_tile(1,0, 3);
        board.set_tile(1,1, 3);
        board.set_tile(1,2, 0);
        board.set_tile(1,3, 0);
        
        board.set_tile(0,0, 3);
        board.set_tile(0,1, 3);
        board.set_tile(0,2, 0);
        board.set_tile(0,3, 0);
        System.out.println(board);
        ThreesController threes = new ThreesController(board);
        threes.move_down();
        System.out.println(threes.getBoard());
        assertTrue(threes.getBoard().get_tile(3, 0).getValue() == 3);
        assertTrue(threes.getBoard().get_tile(3, 1).getValue() == 3);
        assertTrue(threes.getBoard().get_tile(2, 0).getValue() == 3);     
        assertTrue(threes.getBoard().get_tile(2, 1).getValue() == 3);
        assertTrue(threes.getBoard().get_tile(1, 0).getValue() == 3);
        assertTrue(threes.getBoard().get_tile(1, 1).getValue() == 3);
        assertTrue((threes.getBoard().get_tile(0, 0).getValue() == 0 && threes.getBoard().get_tile(0, 1).getValue() != 0 ) ||
        		(threes.getBoard().get_tile(0, 0).getValue() != 0 && threes.getBoard().get_tile(0, 1).getValue() == 0 ));
	}
	
	@Test
	public void moveDownAndRightTest() {
		ThreesBoard board = new ThreesBoard(); 
        
        board.set_tile(3,0, 3);
        board.set_tile(3,1, 1);
        board.set_tile(3,2, 1);
        board.set_tile(3,3, 1);
        
        board.set_tile(2,0, 2);
        board.set_tile(2,1, 1);
        board.set_tile(2,2, 6);
        board.set_tile(2,3, 3);
        
        board.set_tile(1,0, 0);
        board.set_tile(1,1, 0);
        board.set_tile(1,2, 0);
        board.set_tile(1,3, 3);
        //System.out.println(board);
        ThreesController threes = new ThreesController(board);
        threes.move_down();
        //System.out.println(threes.getBoard());
        threes.move_right();
        //System.out.println(threes.getBoard());
        assertTrue(threes.getBoard().get_tile(2, 3).getValue() == 12);
        assertTrue(threes.getBoard().get_tile(2, 2).getValue() == 1);
        assertTrue(threes.getBoard().get_tile(2, 1).getValue() == 2);    
        assertTrue(threes.getBoard().get_tile(2, 0).getValue() != 0); 
        assertTrue(threes.getBoard().get_tile(0, 3).getValue() != 0);  
	}
	

	@Test
	public void moveDownAndLeftTest() {
		ThreesBoard board = new ThreesBoard(); 
        
        board.set_tile(3,0, 3);
        board.set_tile(3,1, 1);
        board.set_tile(3,2, 1);
        board.set_tile(3,3, 1);
        
        board.set_tile(2,0, 2);
        board.set_tile(2,1, 1);
        board.set_tile(2,2, 6);
        board.set_tile(2,3, 3);
        
        board.set_tile(1,0, 0);
        board.set_tile(1,1, 0);
        board.set_tile(1,2, 0);
        board.set_tile(1,3, 3);
        //System.out.println(board);
        ThreesController threes = new ThreesController(board);
        threes.move_down();
        //System.out.println(threes.getBoard());
        threes.move_left();
        //System.out.println(threes.getBoard());
        assertTrue(threes.getBoard().get_tile(2, 2).getValue() == 6);
        assertTrue(threes.getBoard().get_tile(2, 1).getValue() == 6);
        assertTrue(threes.getBoard().get_tile(2, 0).getValue() == 3);
        assertTrue(threes.getBoard().get_tile(0, 2).getValue() != 0);
        assertTrue((threes.getBoard().get_tile(2, 3).getValue() != 0 && threes.getBoard().get_tile(0, 3).getValue() == 0) ||
        		(threes.getBoard().get_tile(2, 3).getValue() == 0 && threes.getBoard().get_tile(3, 3).getValue() != 0)); 
        }
	

}
