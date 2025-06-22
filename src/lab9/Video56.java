package lab9;

import java.util.Scanner;

public class Video56 {

//	Tạo class SinhVien bao gồm:
//		masv: String
//		hoten: String
//		diem: double
//		age: int
//		- Viết setter, getter, constructor, toString
//		- Nhập dữ liệu sinh viên từ bàn phím và in ra màn hình (với hàm toString)
//		- Xử lý ngoại lệ cho các trường hợp
//		+ 0< điểm < 10. điểm là số thực
//		+ 18 < age < 100. tuổi là số nguyên
//		=> nếu có ngoại lệ thì thông báo lỗi và yêu cầu nhập lại

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
