package quanly_sach;

public class TestMain {
	public static void main(String[] args) {

		Ngay ngay1 = new Ngay(22, 02, 1998);
		Ngay ngay2 = new Ngay(29, 10, 2000);
		Ngay ngay3 = new Ngay(2, 8, 2018);

		TacGia tg1 = new TacGia("Minh", ngay1);
		TacGia tg2 = new TacGia("Manh", ngay3);
		TacGia tg3 = new TacGia("Ngoc", ngay2);

		Sach sach1 = new Sach("Lap trinh C", 5000, 2025, tg1);
		Sach sach2 = new Sach("Lap trinh Java", 15000, 2020, tg3);
		Sach sach3 = new Sach("Lap trinh C++", 25000, 2021, tg2);

		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();

		System.out.println("So sanh NXB 1 & 2: " + sach1.kiemTraCungNamXuatBan(sach2));

		System.out.println("Sach 1 giam 10%: " + sach1.giaSauKhiGiam(10));
	}

}
