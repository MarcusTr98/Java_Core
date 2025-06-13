package chapter4;

public class Video28 {
	public static void main(String[] args) {
		Student st1 = new Student();

		Student st2 = new Student("Minh", 27);
		st2.setName("Marcus Tran deptrai");
		System.out.println("Check obj: " + st2.getName() + " " + st2.getAge());
	}
}
