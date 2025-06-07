package java_project2025;

import java.util.Scanner;

public class Lab1 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int choice;
		do {
			printMenu();
			System.out.print("Lựa chọn của bạn: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				solveLinearEquation();
				System.out.println("\n>> GIẢI PHƯƠNG TRÌNH BẬC NHẤT <<");
				break;
			case 2:
				solveQuadraticEquation();
				System.out.println("\n>> GIẢI PHƯƠNG TRÌNH BẬC HAI <<");
				break;
			case 3:
				calculateElectricBill();
				System.out.println("\n>> TÍNH TIỀN ĐIỆN <<");
				break;
			case 4:
				System.out.println(">> Bạn đã thoát chương trình <<");
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
			}
		} while (choice != 4);

		scanner.close();
	}

	private static void printMenu() {
		System.out.println("\n>> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất              |");
		System.out.println("| 2. Giải phương trình bậc hai               |");
		System.out.println("| 3. Tính số tiền điện                       |");
		System.out.println("| 4. Kết thúc                                |");
		System.out.println("++ ----------------------------------------- ++");
	}

	private static void solveLinearEquation() {
		System.out.print("Nhập a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập b = ");
		int b = scanner.nextInt();

		System.out.printf("Phương trình: %dx + %d = 0\n", a, b);
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình có vô số nghiệm.");
			} else {
				System.out.println("Phương trình vô nghiệm.");
			}
		} else {
			float x = (float) -b / a;
			System.out.printf("Nghiệm x = %.5f\n", x);
		}
	}

	private static void solveQuadraticEquation() {
		System.out.print("Nhập a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập b = ");
		int b = scanner.nextInt();
		System.out.print("Nhập c = ");
		int c = scanner.nextInt();

		System.out.printf("Phương trình: %dx^2 + %dx + %d = 0\n", a, b, c);
		if (a == 0) {
			System.out.println("Vui lòng nhập lại vì đây là PT bậc nhất");
			solveLinearEquation();
		} else {
			int delta = b * b - 4 * a * c;

			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm.");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Phương trình có nghiệm kép x = %.3f\n", x);
			} else {
				double sqrtDelta = Math.sqrt(delta);
				double x1 = (-b + sqrtDelta) / (2 * a);
				double x2 = (-b - sqrtDelta) / (2 * a);
				System.out.printf("Hai nghiệm phân biệt: x1 = %.3f, x2 = %.3f\n", x1, x2);
			}
		}
	}

	private static void calculateElectricBill() {
		System.out.print("Nhập số điện đã dùng: ");
		int units = scanner.nextInt();
		int bill;
		if (units <= 100) {
			bill = units * 1000;
		} else {
			bill = 100 * 1000 + (units - 100) * 1500;
		}
		System.out.printf("Số tiền điện phải trả: %,d VND\n", bill);
	}
}
