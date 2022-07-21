package cleancode.tdd.interaction;

public class Car {
	Engine engine;
	
	Car(Engine engine)
	{
		this.engine = engine;
	}

	public void start() {
		System.out.println("Car test");
		this.engine.start();
	}
}
