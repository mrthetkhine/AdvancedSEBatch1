package cleancode.tdd.interaction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.atLeast;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class TestCar {

	@Mock
	Engine engine;
	
	@Mock
	private List<String> mock;
	
	@Test
	public void testWhenCarStartItShouldCalledEngineStart()
	{
		
		Car car = new Car(engine);
		car.start();
		
		Mockito.verify(engine,times(1)).start();
		when(engine.getMile()).thenReturn(200);
		
		int mile = engine.getMile();
		System.out.println("Mile "+mile);
		assertEquals(200,engine.getMile());
		/*
		mock.add("one");
        mock.add("two");

        Mockito.verify(mock, times(2))
               .add(anyString()); // method was called exactly 2 times

        Mockito.verify(mock, atLeast(2))
               .add(anyString());
               */ 
	}
}
