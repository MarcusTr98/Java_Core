package btap_kethua;

public class Test {
	public static void main(String[] args) {
		BabyDog baby1 = new BabyDog();
		Cat cat1 = new Cat();
		Bird bird1 = new Bird();

		baby1.eat();
		baby1.bark();
		baby1.weep();
		baby1.name = "bob";

		cat1.name = "Long";
		cat1.eat();
		cat1.meow();

		bird1.name = "Nicky";
		bird1.eat();
		bird1.fly();

		System.out.println("Tên của em chó: " + baby1.name);
		System.out.println("thông tin của em chó: " + baby1);
		System.out.println("thông tin của em mèo: " + cat1);
		System.out.println("thông tin của em chim: " + bird1);

	}
}
