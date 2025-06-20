package java_project2025;

import java.util.ArrayList;

public class Video38_1 {
	public static void main(String[] args) {

		Student st1 = new Student("Nam", "SD01");
		Student st2 = new Student("Minh", "SD02");
		Student st3 = new Student("Duong", "SD03");
		Student st4 = new Student("Ngoc", "SD05");
		Student st5 = new Student("Hai", "SD04");

		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(st5);
		arr.add(st4);
		arr.add(st3);
		arr.add(st2);
		arr.add(st1);

		System.out.println(" check array " + arr);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("N")) {
				System.out.println("Start with N: " + arr.get(i));
			}
		}
	}
}
