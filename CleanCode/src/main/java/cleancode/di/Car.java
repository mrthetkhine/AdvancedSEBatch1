package cleancode.di;

public class Car {
	Engine engine;
	
	Car(Engine engine)
	{
		this.engine = engine;
	}
	public void start()
	{
		this.engine.start();
	}
}
