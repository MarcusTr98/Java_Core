package quanly_veXemPhim;

public class Tess {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(7, 10, 2025);
		Ngay ngay2 = new Ngay(7, 01, 2025);
		Ngay ngay3 = new Ngay(17, 03, 2025);

		HangSanXuat brand1 = new HangSanXuat("Disley Land", "Mỹ");
		HangSanXuat brand2 = new HangSanXuat("DC", "Anh");
		HangSanXuat brand3 = new HangSanXuat("Marvel", "Mỹ");

		BoPhim phim1 = new BoPhim("Minh Minh", 2001, brand3, 50000, ngay3);
		BoPhim phim2 = new BoPhim("Minh Duong", 2024, brand2, 90000, ngay1);
		BoPhim phim3 = new BoPhim("Minh Hanh", 2023, brand1, 55000, ngay2);

		System.out.println("Thong tin phim1: " + phim1);
		System.out.println("Thong tin phim2: " + phim2);
		System.out.println("Thong tin phim3: " + phim3);

		System.out.println("giá phim1 rẻ hơn giá phim2: " + phim1.kiemTraGiaVeReHon(phim2));
		System.out.println("giá phim2 rẻ hơn giá phim1: " + phim2.kiemTraGiaVeReHon(phim1));
		System.out.println("giá phim1 rẻ hơn giá phim3: " + phim1.kiemTraGiaVeReHon(phim3));

		System.out.println("Tên của hãng phim1: " + phim1.getHangSanXuat().getTenHang());
		System.out.println("Tên của hãng phim2: " + phim2.getHangSanXuat().getTenHang());
		System.out.println("Tên của hãng phim3: " + phim3.getHangSanXuat().getTenHang());

		System.out.println("Giá vé của phim 1 khi KM 10%: " + phim1.giaVeKhiCoKM(10));
		System.out.println("Giá vé của phim 2 khi KM 15%: " + phim2.giaVeKhiCoKM(15));
		System.out.println("Giá vé của phim 3 khi KM 22%: " + phim3.giaVeKhiCoKM(22));

	}
}
