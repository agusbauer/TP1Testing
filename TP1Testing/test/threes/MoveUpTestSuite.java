/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threes;

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


    
    
    @Test(timeout = 2000)
    public void mustFoundElem() {
        ThreesBoard board = new ThreesBoard(); 
        board.set_tile(3,0,1);
        board.set_tile(2,0,2);
        ThreesBoard board2 = new ThreesBoard();
        //board2.set_tile(3,0,0);
        //board2.set_tile(0,0,0);
        ThreesController threes = new ThreesController(board);
        threes.move_up();
        assert(board.equalTo(board2));
       
    }
}
