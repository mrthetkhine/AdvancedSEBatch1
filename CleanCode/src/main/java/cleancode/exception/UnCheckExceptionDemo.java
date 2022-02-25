package cleancode.exception;

public class UnCheckExceptionDemo {
	public void method()
	{
		throw new RuntimeException("Unknown Error");
	}
	public void checkMethod()throws Exception
	{
		throw new Exception("Some errorr");
	}
	
	public static void main(String[]args)
	{
		UnCheckExceptionDemo demo = new UnCheckExceptionDemo();
		//demo.method();
		
		try {
			demo.checkMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
