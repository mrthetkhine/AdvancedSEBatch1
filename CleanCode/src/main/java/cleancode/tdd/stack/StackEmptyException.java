package cleancode.tdd.stack;

public class StackEmptyException extends RuntimeException {
	StackEmptyException(String message)
	{
		super(message);
	}
}
