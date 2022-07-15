package cleancode.tdd.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
/*
 * Stack
    push()
        put element on top of the stack,size must be increased by 1.
        if stack size is full, it should throw StackFullException
    pop()
        retrives top element from stack.
        size must be decreased by 1.
        if stack is empty , it should throw StackEmptyException
    peep()
        it should return top element,
        size should not be changed.
    size()
        return the size of stack.

 * */
public class TestStack {

	Stack stack = new Stack();
	
	@Test
	public void testEmptyStackShouldReturnZeroAsSize()
	{
		//No Act
		//Assert
		assertEquals(0, stack.size());
	}
	
	@Test
	public void testPushWithOneElement()
	{
		stack.push(10);
		
		assertEquals(10, stack.peep());
		assertEquals(1, stack.size());
	}
	
	@Test
	public void testPushWithTwoElement()
	{
		stack.push(20);
		stack.push(30);
		
		assertEquals(30, stack.peep());
		assertEquals(2, stack.size());
	}
	
	@Test
	public void testPeepShouldThrowStackEmptyExceptionWhenEmpty()
	{
		StackEmptyException exception = assertThrows(StackEmptyException.class, () -> {
	       stack.peep();
	    });
		assertEquals("Stack is empty", exception.getMessage());
	}
}
