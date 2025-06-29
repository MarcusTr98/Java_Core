package quanly_SV;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(22, 02, 1998);
		Ngay ngay2 = new Ngay(9, 05, 1997);
		Ngay ngay3 = new Ngay(25, 5, 2024);

		Lop lopCNTT = new Lop("SD001", "Công nghệ thông tin");
		Lop lopMKT = new Lop("MK001", "Marketing");
		Lop lopDM = new Lop("DG001", "Digital Marketing");

		SinhVien sv1 = new SinhVien("SV01", "Minh", ngay1, 9.9, lopCNTT);
		SinhVien sv2 = new SinhVien("SV02", "Duong", ngay2, 8.9, lopDM);
		SinhVien sv3 = new SinhVien("SV03", "Luong", ngay3, 4.9, lopMKT);

		// in ra thông tin sinhVien
		System.out.println("Thong tin sv1: " + sv1);
		System.out.println("Thong tin sv2: " + sv2);
		System.out.println("Thong tin sv3: " + sv3);

		System.out.println("sv1 đỗ: " + sv1.kiemTraThiDau());
		System.out.println("sv2 đỗ: " + sv2.kiemTraThiDau());
		System.out.println("sv3 đỗ: " + sv3.kiemTraThiDau());

		System.out.println("sv1 trùng ngày sinh sv2: " + sv1.kiemTraCungNgaySinh(sv2));
		System.out.println("sv1 trùng ngày sinh sv3: " + sv1.kiemTraCungNgaySinh(sv3));
		System.out.println("sv2 trùng ngày sinh sv3: " + sv2.kiemTraCungNgaySinh(sv3));

		System.out.println("Sv3 đang học Khoa: " + sv1.layTenKhoa());

	}
}
