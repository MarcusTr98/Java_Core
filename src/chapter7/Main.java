package chapter7;

class Animal {
	void eat() {
		System.out.println("Animal is eating...");
	};
}

class Dog extends Animal {
//	void eat() {
//		System.out.println("dog is eating...");
//	};
}

class BabyDog extends Dog {
//	void eat() {
//		System.out.println("babyDog is eating...");
//	};
}

public class Main {
	public static void main(String[] args) {
		System.out.println("run main chapter7");
		Animal a = new BabyDog();
		a.eat();

	}
}
