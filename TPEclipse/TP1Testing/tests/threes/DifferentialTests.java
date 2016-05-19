package threes;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

@RunWith(Theories.class)
public class DifferentialTests {
	
	@Theory
	public void compareToAnotherThreesController(@BoardGeneratorInterface(numberOfBoards=100) ThreesBoard board){
		assumeThat(board,CoreMatchers.not(CoreMatchers.equalTo(null)));
		ThreesController threes = new ThreesController(board.clone());
		AnotherThreesController threes2 = new AnotherThreesController(board.clone());
		assertThat(threes.move_up(),CoreMatchers.equalTo(threes2.move_up()));
		//assumeThat(moveUpResult,CoreMatchers.equalTo(true));
		for (int i = 0; i < ThreesBoard.ROWS-1; i++) { // no recorre la ultima fila por que ahi se pone un valor aleatorio
			for (int j = 0; j < ThreesBoard.COLUMNS; j++) {
				int value = threes.getBoard().get_tile(i, j).getValue();
				int value2 = threes2.getBoard().get_tile(i, j).getValue();
				assertThat(value,CoreMatchers.equalTo(value2));
			}
		}
	}
}
