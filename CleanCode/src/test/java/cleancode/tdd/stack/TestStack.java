package cleancode.tdd.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
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
@DisplayName("Test Suite for Stack class")
public class TestStack {

	Stack stack = new Stack();
	
	@DisplayName("Empty stack size should be zero")
	@Test
	public void testEmptyStackShouldReturnZeroAsSize()
	{
		//No Act
		//Assert
		assertEquals(0, stack.size(),"Stack size should be zero when empty");
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
	public void testPushWithMaxLimitShouldThrowStackOverflowException()
	{
		StackOverflowException exception = assertThrows(StackOverflowException.class, () -> {
			for(int i=0;i< 11;i++)
			{
				stack.push(i);
			}
		    });
	   
		assertEquals("Stack is full", exception.getMessage());
	}
	@Test
	public void testPeepShouldThrowStackEmptyExceptionWhenEmpty()
	{
		StackEmptyException exception = assertThrows(StackEmptyException.class, () -> {
	       stack.peep();
	    });
		assertEquals("Stack is empty", exception.getMessage());
	}
	@Test
	public void testPeepShouldReturnTopElementWithoutChaningSize()
	{
		int element = 100;
		stack.push(element);
		
		int returnedElement = stack.peep();
		
		assertEquals(returnedElement, element);
		assertEquals(1, stack.size());
		
	}
	@Test
	public void testPopShouldThrowStackEmptyExceptionWhenEmpty()
	{
		StackEmptyException exception = assertThrows(StackEmptyException.class, () -> {
	       stack.pop();
	    });
		assertEquals("Stack is empty", exception.getMessage());
	}
	@Test
	public void testPopShouldReturnLastElementPushedAndChangeSize()
	{
		int element = 10;
		stack.push(element);
		
		assertEquals(element, stack.pop());
		assertEquals(0, stack.size());
	}
	@Test
	public void testPushElementShouldReturnWithPopInOrder()
	{
		for(int i=0;i< 10; i++)
		{
			stack.push(i);
		}
		for(int i=9;i>=0; i--)
		{
			assertEquals(i, stack.pop());
		}
		assertEquals(0, stack.size());
	}
}
