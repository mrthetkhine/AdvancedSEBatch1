package cleancode.tdd.stack;

public class StackOverflowException extends RuntimeException {
	StackOverflowException(String message)
	{
		super(message);
	}
}

