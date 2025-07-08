package ngay_thang_nam;

public class Main {
	public static void main(String[] args) {
		ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Ngay.Monday, "Toán Lý Văn");
		ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Ngay.Tuesday, "Tiếng Anh Hóa");
		System.out.println(tkb_t2);
		Ngay[] days = Ngay.values();
		for (Ngay day : days) {
			System.out.println("Day: " + day);
		}

		int x = Thang.Thang_ba.soNgay();
		System.out.println(x);
	}

}
