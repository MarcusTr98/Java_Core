package java_project2025;

import java.util.ArrayList;

public class TestAL {
	public static void main(String[] args) {
		// arraylist là kiểu dữ liệu obj
		ArrayList a1 = new ArrayList<>();

		a1.add(2); // add kiểu int vào, => autoboxing, compiler tự động convert từ int sang Integer
		a1.add("Marcus Tran"); // add kiểu string vào
		a1.add("Hello");

		System.out.println(a1.toString() + " " + a1.size());// arraylist là kiểu dữ liệu obj
		// System.out.println(a1.get(1));

		// định nghĩa kiểu dữ liệu cho arrayList
		ArrayList<String> a2 = new ArrayList<String>();

		a2.add("Marcus Tran"); // add kiểu string vào
		a2.add("Hello");
		a2.add("Hello 1");
	}
}
