/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author agustin
 */

public class MoveUpTestSuite {

	/*particiones: -tablero lleno,tablero vacio, tablero con entre 1 y 15 elementos,
	  			   -hay elementos para fusionarse, no hay elementos para fusionarse	 
	  			   -tablero null, tablero no null 
	  bloques: tablero lleno sin fusion, tablero vacio sin fusion, tablero con elems sin fusion.
	  		tablero lleno con fusion,
	  			   */
	
	
    @Test(timeout = 2000)
    public void fullBoardMatch() {
        ThreesBoard board = new ThreesBoard(); 
        
        for (int i = 0; i < ThreesBoard.ROWS; i++) {
            for (int j = 0; j < ThreesBoard.COLUMNS; j++) {
                board.set_tile(i, j, 1); 
            }
        }
        board.set_tile(0, 0, 2);
        
        System.out.println(board);
        ThreesBoard board2 = new ThreesBoard();
        board2.set_tile(0,0,3);
        board2.set_tile(1,0,3);
        board2.set_tile(2,0,6);
        //board2.set_tile(3,0,);
        ThreesController threes = new ThreesController(board);
        threes.move_up();
       // System.out.println(board);
        assertTrue(threes.getBoard().get_tile(0, 0).getValue() == 3);
        assertTrue(threes.getBoard().get_tile(1, 0).getValue() == 1);
        assertTrue(threes.getBoard().get_tile(2, 0).getValue() == 1);
    }
    
    @Test(timeout = 2000)
    public void BoardWithElemsMatch() {
        ThreesBoard board = new ThreesBoard(); 
        board.set_tile(0,0,3);
        board.set_tile(1,0,3);
        board.set_tile(2,0,0);
        board.set_tile(3,0,0);
        System.out.println(board);
        ThreesController threes = new ThreesController(board);
        threes.move_up();
       // System.out.println(board);
        assertTrue(threes.getBoard().get_tile(0, 0).getValue()==6);
        assertTrue(threes.getBoard().get_tile(1, 0).getValue()==0);
        assertTrue(threes.getBoard().get_tile(2, 0).getValue()==0);
    }
    
    @Test(expected=NullPointerException.class)
    public void nullBoard() {
        ThreesBoard board = null; 
        ThreesController threes = new ThreesController(board);
        threes.move_up();
    }
    
    @Test(timeout = 2000)
    public void emptyBoardWithoutMatch() {
        ThreesBoard board = new ThreesBoard(); 
        ThreesBoard board2 = new ThreesBoard(); 
        ThreesController threes = new ThreesController(board);
        threes.move_up();
        assertTrue(board.equalTo(board2));
    }
    
    @Test(timeout = 2000)
    public void fullBoardNoMatch() {
        ThreesBoard board = new ThreesBoard(); 
        for (int i = 0; i < ThreesBoard.ROWS; i++) {
            for (int j = 0; j < ThreesBoard.COLUMNS; j++) {
                board.set_tile(i, j, 1); 
            }
        }
        ThreesBoard board2 = new ThreesBoard(); 
        for (int i = 0; i < ThreesBoard.ROWS; i++) {
            for (int j = 0; j < ThreesBoard.COLUMNS; j++) {
                board2.set_tile(i, j, 1); 
            }
        }
        ThreesController threes = new ThreesController(board);
        threes.move_up();
        assertTrue(board.equalTo(board2));
    }
    
    
}
