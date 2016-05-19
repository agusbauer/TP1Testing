package threes;

import org.junit.experimental.theories.ParametersSuppliedBy;

@ParametersSuppliedBy(BoardGeneratorSupplier.class)
public @interface BoardGeneratorInterface{
	int numberOfBoards();
}
