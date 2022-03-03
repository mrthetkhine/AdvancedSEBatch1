package cleancode.encapsulation;

public class EncapsulationDemo {
	public static void main(String[]args)
	{
		User userA = new User();
		userA.credit(100);
		
		//userA.debit(50);
		//userA.debit(50);
		
		long amount = 20;
		User userB = new User();
		try {
			userA.transferTo(userB, amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
