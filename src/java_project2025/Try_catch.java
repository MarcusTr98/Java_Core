package java_project2025;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// xử lý đầu vào khối try
			try {
				System.out.print("Nhập số x (khác 0): ");
				int x = scanner.nextInt();

				// ném ra 1 exception tự tạo, dừng rồi chạy vào catch để xử lý
				if (x == 0) {
					// tạo lỗi giả lập
					throw new ArithmeticException("Không được chia cho 0");
				}

				// hợp lệ thì in kq + break
				int result = 10 / x;
				System.out.println("Kết quả 10/x = " + result);
				break;

				// xử lý khi x ko phải số nguyên
			} catch (InputMismatchException e) {
				System.out.println("Lỗi: Bạn phải nhập một số nguyên.");
				scanner.nextLine(); // clear buffer

				// bắt lỗi = 0 vào đây xử lý
			} catch (ArithmeticException e) {

				// xử lý và in ra thông điệp lỗi
				// e.getMessage ghi lại lỗi ở throw new dev cung cấp
				System.out.println("Lỗi: " + e.getMessage());

				// luôn chạy sau khi thực thi try...catch
			} finally {
				System.out.println("→ Kết thúc lượt nhập\n");
			}
		}

		scanner.close();
	}
}
