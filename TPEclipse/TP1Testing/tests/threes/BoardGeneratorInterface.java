package threes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.junit.experimental.theories.ParametersSuppliedBy;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(BoardGeneratorSupplier.class)
public @interface BoardGeneratorInterface{
	int numberOfBoards();
}
