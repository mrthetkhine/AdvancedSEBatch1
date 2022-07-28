package cleancode.tdd.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import cleancode.tdd.stack.StackOverflowException;
import cleancode.di.Engine;
@ExtendWith(MockitoExtension.class)
public class MockitoTest {
	@Test
	public void testMockito()
	{	
		List mockList = Mockito.mock(ArrayList.class);
		
		mockList.add("one");
		
		Mockito.when(mockList.get(0)).thenReturn("one");
		assertEquals("one",mockList.get(0));
		///System.out.println("Mock get "+mockList.get(0));
		Mockito.verify(mockList).add("one");
		//System.out.println("MockList size "+mockList.size());
		Mockito.when(mockList.size()).thenReturn(1);
		assertEquals(1,mockList.size());
	}
	
	@Test 
	public void testSpy()
	{
		List<String> strList = Mockito.spy(new ArrayList<String>());
		
		strList.add("one");
		strList.add("two");
		
		Mockito.verify(strList).add("one");
		Mockito.verify(strList).add(anyString());
		
		assertEquals(2,strList.size());
		
		Mockito.when(strList.size()).thenReturn(100);
		assertEquals(100,strList.size());
	}
	
	@Test
	public void testCaptureAgrument()
	{
		List mock = Mockito.mock(List.class);
		ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
		
		mock.add("one");
		//mock.add("two");
		Mockito.verify(mock).add(argument);
		
		assertEquals("one",argument.getValue());
	}
	@Test
	public void testThrowException()
	{
		List mock = Mockito.mock(List.class);
		Mockito.when(mock.get(0)).thenThrow(NullPointerException.class);
		
		NullPointerException exception = assertThrows(NullPointerException.class, () -> {
			mock.get(0);
		});
		
	}
	@Test
	public void testDoThrowException()
	{
		Engine mock = Mockito.mock(Engine.class);
		doThrow(new NullPointerException()).when(mock).start();
		
		NullPointerException exception = assertThrows(NullPointerException.class, () -> {
			mock.start();
		});
		
	}
}
