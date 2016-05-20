package threes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

public class BoardGeneratorSupplier extends ParameterSupplier{
	
	int[] validValues = {0,1,2,3,6,12};
	
	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) throws Throwable {
		BoardGeneratorInterface annotation = sig.getAnnotation(BoardGeneratorInterface.class);
		int numOfBoards = annotation.numberOfBoards();
		List<PotentialAssignment> boards = new ArrayList<PotentialAssignment>();
		for (int i = 0; i < numOfBoards; i++) {			
			boards.add(PotentialAssignment.forValue(Integer.toString(i), generateRandomBoard()));
		}
		return boards;
	}
	
	private int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	private ThreesBoard generateRandomBoard(){
		ThreesBoard board =  new ThreesBoard();
		for (int j = 0; j < ThreesBoard.ROWS; j++) {
			for (int k = 0; k < ThreesBoard.COLUMNS; k++) {
				int value = validValues[getRandomNumberInRange(0,validValues.length-1)];			
				board.set_tile(j, k, value);
			}
		}
		return board;
	}

}
