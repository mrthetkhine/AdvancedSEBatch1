package cleancode.concurrency;

public class CouncurrenyDemo {
	public static void main(String []args)
	{
		Data data = new Data();
		IncThread thread1 = new IncThread(data);
		IncThread thread2 = new IncThread(data);
		IncThread thread3 = new IncThread(data);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Data "+data.count);
		
	}
}
