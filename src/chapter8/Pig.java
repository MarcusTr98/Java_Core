package chapter8;

public class Pig implements I_Animal {

	@Override
	public void animalSound() {
		// The body of animalSound( ) is provided here
		System.out.println("The pig says: wee wee");
	}

	@Override
	public void sleep() {
		// The body of sleep( ) is provided here
		System.out.println("Zzz");
	}

	@Override
	public void run() {
		// The body of run( ) is provided here
		System.out.println("Brum brum");
	}

}
