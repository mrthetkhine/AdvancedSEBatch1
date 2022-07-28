package cleancode.encapsulation;

public class BankAccount {
	private String account;
	private long totalAmount;
	
	void credit(long amount) throws Exception
	{
		if(amount >0)
		{
			this.totalAmount += amount;
		}
		else
		{
			throw new Exception("Amount should be greater than zero for credit");
		}
	}
	void debit(long amount) throws Exception
	{
		if( this.totalAmount >= amount)
		{
			this.totalAmount -= amount;
		}
		else
		{
			throw new Exception("Amount should be greater than or equal to total for debit");
		}
	}
}
