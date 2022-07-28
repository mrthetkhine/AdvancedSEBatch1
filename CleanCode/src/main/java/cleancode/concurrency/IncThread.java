package cleancode.concurrency;

public class IncThread extends Thread{
	Data data;
	
	IncThread(Data data)
	{
		this.data = data;
	}
	public void run()
	{
		
		for(int i=0;i < 100000;i++)
		{
			synchronized(this.data)
			{
				this.data.count ++;
			}
			
		}
	}
}
