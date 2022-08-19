package cleancode.tdd.kata.banking;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AccountTest {
	
	
	private static final String DATE = "14/01/2012||";
	private static final String HEADER = "Date||Amount||Balance\r\n";
	@Mock Printer printer;
	AccountService account;
	
	@BeforeEach
	public void setUp()
	{
		this.account = new Account(printer);
	}
	@Test
	public void testDeposit()
	{
		final int amount = 1000;
	
		account.deposit(amount);
		account.printStatement();
		
		String result = HEADER
						+DATE+amount+"||"+amount+"\r\n";
		Mockito.verify(printer).print(result);
	}
	@Test
	public void testDeposit2000()
	{
		final int amount = 2000;
		
		account.deposit(amount);
		
		account.printStatement();
		
		String result = HEADER+DATE+amount+"||"+amount+"\r\n";
		Mockito.verify(printer).print(result);
	}
	
	@Test
	public void testDeposit2000After1000()
	{
		int amount = 1000;
		
		account.deposit(amount);
		account.deposit(2000);
		
		account.printStatement();
		
		String result = HEADER
					+DATE+amount+"||"+amount+"\r\n"
					+DATE+2000+"||"+3000+"\r\n";
		Mockito.verify(printer).print(result);
	}
	@Test
	public void testDepositNegativeValue()
	{
		final int amount = -5;
		
		RuntimeException exception = assertThrows(RuntimeException.class, () -> {
			account.deposit(amount);
		});
		
		
		account.printStatement();
		
		String result = HEADER;
		Mockito.verify(printer).print(result);
	}
	@Test
	public void withdraw()
	{
		final int amount = 5;
		
		RuntimeException exception = assertThrows(RuntimeException.class, () -> {
			account.withdraw(amount);
		});
		
		account.printStatement();
		
		String result = HEADER;
		Mockito.verify(printer).print(result);
	}
	@Test
	public void withdraw1000AfterDeposit2000()
	{
		final int amount = 2000;
		
		account.deposit(amount);
		account.withdraw(1000);
		
		account.printStatement();
		
		String result = HEADER
						+DATE+2000+"||"+2000+"\r\n"
						+DATE+1000+"||"+1000+"\r\n";
		Mockito.verify(printer).print(result);
	}
	@Test
	public void withdrawInvalidAmount()
	{
		final int amount = 2000;
		
		account.deposit(amount);
		RuntimeException exception = assertThrows(RuntimeException.class, () -> {
			account.withdraw(3000);
		});
		
		
		account.printStatement();
		
		String result = HEADER
						+DATE+2000+"||"+2000+"\r\n";
		Mockito.verify(printer).print(result);
	}
}
