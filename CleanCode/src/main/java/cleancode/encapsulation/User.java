package cleancode.encapsulation;

public class User {
	private BankAccount account = new BankAccount();

	void credit(long amount)
	{
		try {
			this.account.credit(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void debit(long amount)
	{
		try {
			this.account.debit(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void transferTo(User otherAcc,long amount) throws Exception
	{
		if( this != otherAcc)
		{
			this.debit(amount);
			otherAcc.credit(amount);
		}
		else
		{
			throw new Exception("Money cannot transfer to self account");
		}
	}
	/*
	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}
	*/
	
}
