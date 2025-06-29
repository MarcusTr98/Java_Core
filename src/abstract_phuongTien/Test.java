package abstract_phuongTien;

public class Test {
	public static void main(String[] args) {
		QuocGia qg1 = new QuocGia("VN", "Việt Nam");
		QuocGia qg2 = new QuocGia("USA", "Mẽo");

		HangSanXuat h1 = new HangSanXuat("Hãng 1", qg1);
		HangSanXuat h2 = new HangSanXuat("Hãng 2", qg2);

		PhuongTien mb1 = new MayBay("VN airline", h1, "Dầu");
		PhuongTien xd1 = new XeDap("Đường bộ", h1);
		PhuongTien oto = new XeOto("Đường bộ", h2, "Xăng");

		System.out.println("Lấy hãng sản xuất: " + mb1.layTenHangSanXuat());
		System.out.println("Lấy hãng sản xuất: " + xd1.layTenHangSanXuat());
		System.out.println("Lấy hãng sản xuất: " + oto.layTenHangSanXuat());

		mb1.batDau();
		mb1.dungLai();
		mb1.tangToc();
		System.out.println(mb1.layVanToc());

		System.out.println("in thông tin hãng " + h1);
		System.out.println("in thông tin hãng " + h2);

		System.out.println("in thông tin: " + mb1);
		System.out.println("in thông tin: " + xd1);
		System.out.println("in thông tin: " + oto);

	}
}
