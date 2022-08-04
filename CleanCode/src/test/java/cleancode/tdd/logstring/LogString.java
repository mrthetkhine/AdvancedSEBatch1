package cleancode.tdd.logstring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LogString extends HardDisk{
	private String log = "";
	void readBootSector()
	{
		this.log += "readBootSector ";
	}
	void loadOS()
	{
		this.log += "loadOS ";
	}
	void init()
	{
		this.log += "init ";
	}
	
	@Test
	public void testCallSequence()
	{
		Computer computer = new Computer(this);
		computer.start();
		
		assertEquals("init readBootSector loadOS ",this.log);
	}
}
