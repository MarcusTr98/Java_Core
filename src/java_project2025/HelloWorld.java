package java_project2025;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
//		System.out.println("hello world");
//		int a = 6;
//		int b = 9;
//		int c = a + b;
//		System.out.println("sum: " + c);
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("your name: ");
//		String name = scanner.nextLine();
//		System.out.println("your age: ");
//		int age = scanner.nextInt();
//		System.out.println("my name " + name + ", age " + age);
//		scanner.close();
//
//		int a = 6;
//		int b = 9;
//		int c = Math.max(a, b);
//		System.out.println("Max = " + c);
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("First number: ");
//		int a = scanner.nextInt();
//		System.out.println("Second number: ");
//		int b = scanner.nextInt();
//
//		System.out.println("Min = " + Math.min(a, b) + ", Max = " + Math.max(a, b));
//
//		scanner.close();
//
//		int score = 5;
//		if (score > 5) {
//			System.out.println("Passed");
//		}
//		System.out.println("run here");

//		Scanner sc = new Scanner(System.in);
//		System.out.println("nhap hoa don: ");
//		int tax = sc.nextInt();
//
//		if (tax < 10) {
//			System.out.println("Khong dong thue");
//		} else if (tax >= 10 && tax <= 15) {
//			System.out.println("Thue 10%");
//		} else if (tax >= 15 && tax <= 30) {
//			System.out.println("Thue 20%");
//		} else {
//			System.out.println("Thue 50%");
//		}
//		sc.close();

//		Scanner sc = new Scanner(System.in);
//		System.out.println("nhap so: ");
//		int a = sc.nextInt();
//
//		switch (a) {
//		case 1:
//			System.out.println("Số 1");
//			break;
//		case 2:
//			System.out.println("Số 2");
//			break;
//		default:
//			System.out.println("khác");
//			break;
//		}

		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		System.out.println("Lựa chọn của bạn là : ");

		switch (value) {
		case 1:
			System.out.println("Bạn đã lựa chọn phép cộng");
			break;
		case 2:
			System.out.println("Bạn đã lựa chọn phép trừ");
			break;
		default:
			System.out.println("Bạn đã lựa chọn kết thúc");
			System.exit(0);
		}
	}
}
