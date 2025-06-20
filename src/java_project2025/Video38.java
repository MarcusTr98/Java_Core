package java_project2025;

import java.util.Scanner;

public class Video38 {
	public static void main(String[] args) {
		// hập username và password từ bàn phím
		// Nếu username = "anhminh" và password > 6 ký tự thì hợp lệ
		// gợi ý: sử dụng equals để so sánh; length để check chiều dài

		System.out.println("Nhập vào username: ");
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();

		System.out.println("Nhập vào password: ");
		String passWord = sc.nextLine();

		System.out.println("Username: " + userName + " " + "Password: " + passWord);
		if (userName.equals("anhminh") && passWord.length() > 6) {
			System.out.println("Đăng nhập thành công");
		} else {
			System.out.println("Đăng nhập thất bại");
		}
		sc.close();
	}
}
