package cleancode.tdd.kata.banking;

import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService {

	private static final String DATE = "14/01/2012";

	Printer printer;
	
	List<Transaction> transactions = new ArrayList<>();
	int balance;
	
	Account(Printer printer)
	{
		this.printer = printer;
	}
	@Override
	public void deposit(int amount) {
		
		if(amount > 0)
		{
			this.balance += amount;
			addTransaction(amount);
		}
		else
		{
			throw new RuntimeException("Invalid amount "+amount+" passed for deposit with balance "+balance);
		}
		
	}
	@Override
	public void withdraw(int amount) {
		
		if(this.balance >= amount)
		{
			this.balance -= amount;
			addTransaction(amount);
		}
		else
		{
			throw new RuntimeException("Invalid amount "+amount+" passed for withdraw with balance "+balance);
		}
		
	}
	private void addTransaction(int amount) {
		Transaction depositTran = new Transaction(DATE,amount,balance);
		this.transactions.add(depositTran);
	}

	@Override
	public void printStatement() {
		
		String header = "Date||Amount||Balance\r\n";
		
		StringBuffer statement = new StringBuffer(header);
		for(Transaction trans : this.transactions)
		{
			statement.append(trans +"\r\n");
		}
		this.printer.print(statement.toString());
	}

}
