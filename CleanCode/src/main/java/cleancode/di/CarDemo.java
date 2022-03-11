package cleancode.di;

public class CarDemo {
	public static void main(String[]args)
	{
		Engine engine = new ElectricEngine();
		Car car = new Car(engine);
		car.start();
	}
}
