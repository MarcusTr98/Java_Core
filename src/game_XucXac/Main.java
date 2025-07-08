package game_XucXac;

import java.util.Scanner;

public class Main {
	/*
	 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít hơn
	 * hoặc bằng số tiền họ đang có. Luật chơi như sau: Có 3 viên xúc xắc. Mỗi viên
	 * xúc có 6 mặt có giá tị từ 1 đến 6. Mỗi lần lắc sẽ ra một kết quả. Kết quả =
	 * giá trị xx1 + giá trị xx2 + giá xx3 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết,
	 * người chơi thua. 2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì
	 * người chơi thắng, ngược lại thua 3. Nếu tổng = (11-17) <-> tài => nếu người
	 * chơi đặt xỉu thì người chơi thắng, ngược lại thua
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên của bạn: ");
		String name = scanner.nextLine();

		// cấp cho 5 nhít :D
		Player player = new Player(name, 500000);
		Game game = new Game(player);
		game.start();
	}
}
