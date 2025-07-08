package baiTap_Collection;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon;
		do {
			System.out.println("\n===== MENU =====");
			System.out.println("1. Thêm sinh viên");
			System.out.println("2. In danh sách sinh viên");
			System.out.println("3. Kiểm tra danh sách rỗng");
			System.out.println("4. Số lượng sinh viên");
			System.out.println("5. Xóa tất cả sinh viên");
			System.out.println("6. Kiểm tra sinh viên tồn tại");
			System.out.println("7. Xóa sinh viên theo mã");
			System.out.println("8. Tìm sinh viên theo tên");
			System.out.println("9. Sắp xếp điểm giảm dần");
			System.out.println("10. Sắp xếp điểm tăng dần");
			System.out.println("0. Thoát");
			System.out.println("Vui lòng lựa chọn: ");
			luaChon = Integer.parseInt(scanner.nextLine());
			scanner.nextLine();
			switch (luaChon) {
			case 1 -> {
				System.out.print("Nhập mã SV: ");
				String maSV = scanner.nextLine();
				System.out.print("Nhập họ tên: ");
				String ten = scanner.nextLine();
				System.out.print("Nhập năm sinh: ");
				int nam = Integer.parseInt(scanner.nextLine());
				System.out.print("Nhập điểm TB: ");
				float diem = Float.parseFloat(scanner.nextLine());
				dssv.themSinhVien(new SinhVien(maSV, ten, nam, diem));
			}
			case 2 -> dssv.inDanhSachSinhVien();
			case 3 -> System.out.println(dssv.kiemTraDSSV() ? "Danh sách rỗng" : "Danh sách không rỗng");
			case 4 -> System.out.println("Số lượng: " + dssv.laySoLuongSV());
			case 5 -> dssv.xoaHetSinhVien();
			case 6 -> {
				System.out.print("Nhập mã SV: ");
				String ma = scanner.nextLine();
				System.out.println(dssv.kiemTraTonTai(new SinhVien(ma)) ? "Tồn tại" : "Không tồn tại");
			}
			case 7 -> {
				System.out.print("Nhập mã SV cần xóa: ");
				String ma = scanner.nextLine();
				dssv.xoaSV(new SinhVien(ma));
			}
			case 8 -> {
				System.out.print("Nhập tên SV cần tìm: ");
				String ten = scanner.nextLine();
				dssv.timSV(ten);
			}
			case 9 -> {
				dssv.sapXepDSGiamDan();
				dssv.inDanhSachSinhVien();
			}
			case 10 -> {
				dssv.sapXepDSTangDan();
				dssv.inDanhSachSinhVien();
			}
			case 0 -> System.out.println("Thoát chương trình.");
			default -> System.out.println("Lựa chọn không hợp lệ!");
			}
		} while (luaChon != 0);

		scanner.close();
	}
}
