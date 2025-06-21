package lab9;

import java.util.Scanner;

public class Video56 {

	public static int nhapMaSV() {

		int result;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Nhập mã SV: ");
			try {
				result = sc.nextInt();
				System.out.println("run try");
				break;
			} catch (Exception e) {
				System.out.println("Mã số ko hợp lệ, nhập số nguyên");
				sc.next();
			}
		}
		sc.close();
		return result;
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			int maSV = nhapMaSV();
			Student sv = new Student(maSV, "Minh", 9.9, 27);

			System.out.println("info SV: " + sv);
		} catch (Exception e) {

		}

	}
}
