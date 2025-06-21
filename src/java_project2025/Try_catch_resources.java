package java_project2025;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_resources {
	public static void main(String[] args) {

		// khối try này để xử lý ngoại lệ
		// tài nguyên tạo ngay trong try() => try-with-resources => ko cần close()
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				try {
					int x = nhapSoHopLe(scanner);
					int result = 10 / x;
					System.out.println("Kết quả 10/x = " + result);
					break;

				} catch (ArithmeticException e) {
					System.out.println("Lỗi: " + e.getMessage());

				} catch (InputMismatchException e) {
					System.out.println("Lỗi: Bạn phải nhập số nguyên.");
					scanner.nextLine(); // clear buffer
				} finally {
					System.out.println("→ Kết thúc lượt nhập\n");
				}
			}
		}
	}

	// Tách logic nhập riêng để dễ tái sử dụng và test
	// có thể viết 1 hàm có tham số kiểu Scanner
	private static int nhapSoHopLe(Scanner scanner) {
		System.out.print("Nhập số x (khác 0): ");
		int x = scanner.nextInt();

		if (x == 0) {
			throw new ArithmeticException("Không được chia cho 0");
		}
		return x;
	}
}
