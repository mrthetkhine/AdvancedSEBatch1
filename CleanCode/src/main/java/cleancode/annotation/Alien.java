package cleancode.annotation;

public class Alien {
	@NotNullOrEmpty(message="Name should not be null or empty")
	String name;

	String age;
	
	@NotNullOrEmpty(message="Address should not be null or empty")
	String address;
}
