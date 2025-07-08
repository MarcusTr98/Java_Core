package game_TaiXiu;

import java.text.NumberFormat;
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
public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoan = 500000;

		Scanner sc = new Scanner(System.in);

		Locale lc = new Locale("vi", "VN");
//		NumberFormat numf = NumberFormat.getInstance(lc);
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

		int choice = 0;
		do {
			System.out.println("------------MỜI BẠN LỰA CHỌN------------");
			System.out.println("CHỌN (1) để tiếp tục chơi.");
			System.out.println("CHỌN phím bất kì để thoát.");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("-----------BẮT ĐẦU CHƠI-----------");
				System.out.println("*** Tài khoản của bạn: " + numf.format(taiKhoan) + " bạn muốn cược bao nhiêu?");
				double datCuoc = 0;
				do {
					System.out.println("Hãy đặt cược < hoặc = số tiền bạn có!");
					datCuoc = sc.nextDouble();
				} while (datCuoc <= 0 || datCuoc > taiKhoan);
				int userChoice = 0;
				do {
					System.out.println("****Hãy chọn: 1 = TÀI ..... hoặc 2 = XỈU");
					userChoice = sc.nextInt();
				} while (userChoice != 1 && userChoice != 2);
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();

				int value1 = xucXac1.nextInt(5) + 1;
				int value2 = xucXac2.nextInt(5) + 1;
				int value3 = xucXac3.nextInt(5) + 1;
				int sum = value1 + value2 + value3;

				// tính toán KQ
				System.out.println("***** KẾT QUẢ: " + value1 + "-" + value2 + "-" + value3);
				if (sum == 3 || sum == 18) {
					taiKhoan -= datCuoc;
					System.out.println("***** Tổng là:" + sum + "=> Nhà cái ăn hết, bạn đã tạch!");
					System.out.println("***** Tài khoản của bạn: " + taiKhoan);

				} else if (sum >= 4 && sum <= 10) {
					System.out.println("***** Tổng là:" + sum + "=> XỈU");
					if (userChoice == 2) {
						System.out.println("Bạn đã thắng!");
						taiKhoan += datCuoc;
					} else {
						System.out.println("Bạn đã thua!");
						taiKhoan -= datCuoc;
					}
					System.out.println("***** Tài khoản của bạn: " + taiKhoan);

				} else if (sum >= 11 && sum <= 17) {

					System.out.println("***** Tổng là:" + sum + "=> TÀI");
					if (userChoice == 1) {
						System.out.println("Bạn đã thắng!");
						taiKhoan += datCuoc;
					} else {
						System.out.println("Bạn đã thua!");
						taiKhoan -= datCuoc;
					}

					System.out.println("***** Tài khoản của bạn: " + taiKhoan);
				}
			}

		} while (choice == 1);
	}
}
