package cleancode.tdd.stack;

public class Stack {

	private static final String STACK_IS_EMPTY = "Stack is empty";
	private static final int START = -1;
	private static final int SIZE = 10;
	
	private int top = START;
	private int data[] = new int[SIZE];
	
	public int size() { 
		return top+1;
	}

	public void push(int i) throws StackOverflowException{
		if(top== SIZE-1)
		{
			throw new StackOverflowException("Stack is full");
		}
		data[++top] = i;
	}

	private void throwStackEmptyIfStackEmpty() {
		if(top == START)
		{
			throw new StackEmptyException(STACK_IS_EMPTY);
		}
	}
	public int peep() throws StackEmptyException{
		throwStackEmptyIfStackEmpty();
		return data[top];
	}
	public int pop()throws StackEmptyException
	{
		throwStackEmptyIfStackEmpty();
		return data[top--];
	}
}
