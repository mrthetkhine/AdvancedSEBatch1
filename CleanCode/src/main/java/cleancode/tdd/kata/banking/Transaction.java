package cleancode.tdd.kata.banking;

public class Transaction {
	String date;
	int amount;
	int balance;
	
	Transaction(String date,int amount, int balance)
	{
		this.date = date;
		this.amount = amount;
		this.balance = balance;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String toString()
	{
		return this.date +"||"+this.amount+"||"+this.balance;
	}
	
	
}
