package game_TaiXiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TroChoiTaiXiu {
	private final Scanner scanner = new Scanner(System.in);
	private final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
	private final Random random = new Random();
	private double taiKhoan = 500_000;

	public void batDau() {
		int choice;
		do {
			hienThiMenu();
			choice = scanner.nextInt();
			if (choice == 1)
				choi();
		} while (choice == 1);

		scanner.close();
	}

	private void hienThiMenu() {
		System.out.println("------------MỜI BẠN LỰA CHỌN------------");
		System.out.println("CHỌN (1) để tiếp tục chơi.");
		System.out.println("CHỌN phím bất kì để thoát.");
	}

	private void choi() {
		System.out.println("-----------BẮT ĐẦU CHƠI-----------");
		System.out.println("*** Tài khoản của bạn: " + currencyFormat.format(taiKhoan));
		double datCuoc = nhapSoTienCuoc();
		int luaChon = nhapLuaChon();
		int[] xucXac = tungXucXac();
		int tong = xucXac[0] + xucXac[1] + xucXac[2];
		hienThiKetQua(xucXac);
		xuLyKetQua(datCuoc, luaChon, tong);
	}

	private double nhapSoTienCuoc() {
		double tien;
		do {
			System.out.println("Hãy đặt cược < hoặc = số tiền bạn có!");
			tien = scanner.nextDouble();
		} while (tien <= 0 || tien > taiKhoan);
		return tien;
	}

	private int nhapLuaChon() {
		int chon;
		do {
			System.out.println("****Hãy chọn: 1 = TÀI ..... hoặc 2 = XỈU");
			chon = scanner.nextInt();
		} while (chon != 1 && chon != 2);
		return chon;
	}

	private int[] tungXucXac() {
		return new int[] { random.nextInt(6) + 1, random.nextInt(6) + 1, random.nextInt(6) + 1 };
	}

	private void hienThiKetQua(int[] xucXac) {
		System.out.println("***** KẾT QUẢ: " + xucXac[0] + "-" + xucXac[1] + "-" + xucXac[2]);
	}

	private void xuLyKetQua(double datCuoc, int luaChon, int tong) {
		boolean thang = false;

		if (tong == 3 || tong == 18) {
			System.out.println("***** Tổng là: " + tong + " => Nhà cái ăn hết, bạn đã tạch!");
			taiKhoan -= datCuoc;
		} else {
			String ketQua = (tong >= 4 && tong <= 10) ? "XỈU" : "TÀI";
			System.out.println("***** Tổng là: " + tong + " => " + ketQua);

			if ((tong >= 4 && tong <= 10 && luaChon == 2) || (tong >= 11 && tong <= 17 && luaChon == 1)) {
				System.out.println("Bạn đã thắng!");
				taiKhoan += datCuoc;
			} else {
				System.out.println("Bạn đã thua!");
				taiKhoan -= datCuoc;
			}
		}

		System.out.println("***** Tài khoản của bạn: " + currencyFormat.format(taiKhoan));
	}

}
