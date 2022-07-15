package cleancode.tdd.stack;

public class Stack {

	private static final int START = -1;
	private static final int SIZE = 10;
	
	private int top = START;
	private int data[] = new int[SIZE];
	
	public int size() { 
		return top+1;
	}

	public void push(int i) {
		data[++top] = i;
	}

	public int peep() throws StackEmptyException{
		if(top == START)
		{
			throw new StackEmptyException("Stack is empty");
		}
		return data[top];
	}

}
