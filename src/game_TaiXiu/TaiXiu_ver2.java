package game_TaiXiu;

import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng
 * số tiền họ đang có.
 * Luật chơi như sau:
 * Có 3 viên xúc xắc. Mỗi viên xúc có 6 mặt có giá tị từ 1 đến 6.
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá xx3
 * 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua.
 * 2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 * 3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 */

public class TaiXiu_ver2 {

	// tạo các biến private static final
	// kiểu tiền tệ VN có chấm, phẩy ngăn cách số
	private static final Locale LOCALE_VI = new Locale("vi", "VN");
	// kiểu tiền có đơn vị đ đằng sau
	private static final NumberFormat CURRENCY_FORMAT = NumberFormat.getCurrencyInstance(LOCALE_VI);

	private static final Scanner SCANNER = new Scanner(System.in);
	private static final Random RANDOM = new Random();

	// tạo 1 mảng để lưu lịch sử ng chơi
	private static final List<String> LICH_SU = new ArrayList<>();
	private static String tenNguoiChoi;

	public static void main(String[] args) {
		double taiKhoan = 500000;

		// Nhập tên người chơi từ bàn phím
		System.out.println("Nhập tên của bạn:");
		tenNguoiChoi = SCANNER.nextLine();

		// MENU
		while (true) {
			System.out.println("------------MỜI BẠN LỰA CHỌN------------");
			System.out.println("CHỌN (1) để tiếp tục chơi.");
			System.out.println("CHỌN phím bất kì để thoát.");

			// break vòng nếu thỏa mãn điều kiện if này
			if (SCANNER.nextInt() != 1)
				break;

			System.out.println("-----------BẮT ĐẦU CHƠI-----------");

			// format số tiền của ng chơi
			System.out.printf("*** Tài khoản của bạn: %s, bạn muốn cược bao nhiêu?\n",
					CURRENCY_FORMAT.format(taiKhoan));

			// Nhập số tiền cược hợp lệ
			double datCuoc = nhapTienCuoc(taiKhoan);

			// Nhập lựa chọn Tài/Xỉu
			int luaChonNguoiChoi = nhapLuaChonTaiXiu();

			// Tung 3 viên xúc xắc, tạo 1 mảng kết quả
			int[] ketQua = tungXucXac();
			int tong = ketQua[0] + ketQua[1] + ketQua[2];

			System.out.printf("***** KẾT QUẢ: %d-%d-%d\n", ketQua[0], ketQua[1], ketQua[2]);

			// Tính kết quả, function xuLyKetQua return về double taiKhoan
			taiKhoan = xuLyKetQua(taiKhoan, datCuoc, luaChonNguoiChoi, tong, ketQua);
		}

		// In lịch sử người chơi + KQ
		System.out.println("\n========= LỊCH SỬ CHƠI =========");

		LICH_SU.forEach(System.out::println);

		// Xuất lịch sử ra file txt => mỗi ng chơi 1 file khác nhau
		// FileWWrite => tên của file
		try (FileWriter fw = new FileWriter("lich_su_" + tenNguoiChoi + ".txt")) {
			for (String log : LICH_SU) {
				fw.write(log + "\n");
			}
			// nếu vượt qua try => in ra màn hình thông báo thành công
			System.out.println("\nLịch sử đã được lưu vào file: lich_su_" + tenNguoiChoi + ".txt");
		} catch (IOException e) {
			// ném ra thông báo lỗi
			System.err.println("Lỗi khi ghi file lịch sử: " + e.getMessage());
		}
	}

	// function nhập tiền cược:
	// ko được lớn hơn số tiền tài khoản có, và phải lớn hơn 0
	private static double nhapTienCuoc(double taiKhoan) {
		double datCuoc;
		do {
			System.out.println("Hãy đặt cược < hoặc = số tiền bạn có!");
			datCuoc = SCANNER.nextDouble();
		} while (datCuoc <= 0 || datCuoc > taiKhoan);
		return datCuoc;
	}

	// function chọn tài-xỉu:
	// chỉ chọn 1 hoặc 2
	private static int nhapLuaChonTaiXiu() {
		int choice;
		do {
			System.out.println("****Hãy chọn: 1 = TÀI ..... hoặc 2 = XỈU");
			choice = SCANNER.nextInt();
		} while (choice != 1 && choice != 2);
		return choice;
	}

	private static int[] tungXucXac() {
		// Sinh ngẫu nhiên giá trị 3 viên xúc xắc (1-6) => add vào mảng
		return new int[] { RANDOM.nextInt(6) + 1, RANDOM.nextInt(6) + 1, RANDOM.nextInt(6) + 1 };
	}

	private static double xuLyKetQua(double taiKhoan, double datCuoc, int luaChon, int tong, int[] ketQua) {
		String ketQuaText;
		boolean nguoiChoiThang = false;
		String luaChonText = (luaChon == 1) ? "TÀI" : "XỈU";

		if (tong == 3 || tong == 18) {
			ketQuaText = "=> Nhà cái ăn hết, bạn đã tạch!";
			taiKhoan -= datCuoc;
		} else if (tong >= 4 && tong <= 10) {
			ketQuaText = "=> XỈU";
			nguoiChoiThang = (luaChon == 2);
		} else {
			ketQuaText = "=> TÀI";
			nguoiChoiThang = (luaChon == 1);
		}

		System.out.printf("***** Tổng là: %d %s\n", tong, ketQuaText);

		if (tong != 3 && tong != 18) {
			if (nguoiChoiThang) {
				System.out.println("Bạn đã thắng!");
				taiKhoan += datCuoc;
			} else {
				System.out.println("Bạn đã thua!");
				taiKhoan -= datCuoc;
			}
		}

		System.out.printf("***** Tài khoản của bạn: %s\n", CURRENCY_FORMAT.format(taiKhoan));

		// Ghi log lịch sử chi tiết mỗi ván chơi
		String log = String.format(
				"Người chơi: %s | Đặt: %s (%s) | Xúc xắc: [%d-%d-%d] | Tổng: %d %s | %s | Tài khoản còn: %s",
				tenNguoiChoi, CURRENCY_FORMAT.format(datCuoc), luaChonText, ketQua[0], ketQua[1], ketQua[2], tong,
				ketQuaText, (tong == 3 || tong == 18) ? "Thua" : (nguoiChoiThang ? "Thắng" : "Thua"),
				CURRENCY_FORMAT.format(taiKhoan));
		LICH_SU.add(log);

		return taiKhoan;
	}
}
