package chapter4;

public class Video23 {

	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
//		Student st1 = new Student();
//		st1.name = "Marcus";
//		st1.age = 25;
//		st1.learnJava();
//		System.out.println(st1.name + " " + st1.age);

		Video23 test = new Video23();
		int a = test.sum(6, 9);
		System.out.println("check sum = " + a);
	}
}
