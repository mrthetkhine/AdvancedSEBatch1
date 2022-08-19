package cleancode.tdd.kata.banking;

public class InvalidOperation extends Exception{
	InvalidOperation(String message)
	{
		super(message);
	}
}
