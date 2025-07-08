package game_XucXac;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
	private final Scanner scanner = new Scanner(System.in);
	private final Player player;
	private final List<String> history = new ArrayList<>();

	public Game(Player player) {
		this.player = player;
	}

	// hàm start => đưa ra menu và xử lý game
	public void start() {
		while (true) {
			System.out.println("------------MỜI BẠN LỰA CHỌN------------");
			System.out.println("CHỌN (1) để tiếp tục chơi.");
			System.out.println("CHỌN phím bất kì để thoát.");

			if (scanner.nextInt() != 1)
				break;

			System.out.println("-----------BẮT ĐẦU CHƠI-----------");
			System.out.printf("*** Tài khoản của bạn: %s, bạn muốn cược bao nhiêu?\n", player.formatBalance());

			double bet = inputBet();
			int choice = inputChoice();

			int[] result = Dice.roll();

			// tạo ra 1 IntStream => sau đó tính tổng => ko cần dùng for
			int sum = Arrays.stream(result).sum();

			System.out.printf("***** KẾT QUẢ: %d-%d-%d\n", result[0], result[1], result[2]);

			resolveBet(bet, choice, sum, result);
		}
		printAndSaveHistory();
	}

	// hàm nhập tiền đặt cược
	private double inputBet() {
		double bet;
		do {
			System.out.println("Hãy đặt cược < hoặc = số tiền bạn có!");
			bet = scanner.nextDouble();
			// logic tiền đặt cược phải > 0 và <= số tiền tiền khoản
		} while (bet <= 0 || bet > player.getBalance());
		return bet;
	}

	// hàm nhập lựa chọn
	private int inputChoice() {
		int choice;
		do {
			System.out.println("****Hãy chọn: 1 = TÀI ..... hoặc 2 = XỈU");
			choice = scanner.nextInt();
		} while (choice != 1 && choice != 2);
		return choice;
	}

	// xử lý game khi có đủ tiền cược, lựa chọn, tổng điểm xúc xắc
	private void resolveBet(double bet, int choice, int sum, int[] dice) {
		String resultText;
		boolean win = false;
		// gán toán tử 3 ngôi nếu là 1 thì Tài, nếu != 1 thì Xỉu
		String choiceText = (choice == 1) ? "TÀI" : "XỈU";

		// theo điều kiện đề bài => tính toán và đưa TB kết quả điểm xúc xắc là Tài/ Xỉu
		if (sum == 3 || sum == 18) {
			resultText = "=> Nhà cái ăn hết, bạn đã tạch!";
			player.adjustBalance(-bet);
		} else if (sum >= 4 && sum <= 10) {
			resultText = "=> XỈU";
			win = (choice == 2);
		} else {
			resultText = "=> TÀI";
			win = (choice == 1);
		}
		System.out.printf("***** Tổng là: %d %s\n", sum, resultText);

		// đưa TB kết quả thắng hay thua so với lựa chọn (win) => xử lý tiền cược luôn
		if (sum != 3 && sum != 18) {
			if (win) {
				System.out.println("Bạn đã thắng!");
				player.adjustBalance(bet);
			} else {
				System.out.println("Bạn đã thua!");
				player.adjustBalance(-bet);
			}
		}
		System.out.printf("***** Tài khoản của bạn: %s\n", player.formatBalance());

		// trả về thông tin kết quả lần cược
		String log = String.format(
				"Người chơi: %s | Đặt: %s (%s) | Xúc xắc: [%d-%d-%d] | Tổng: %d %s | %s | Tài khoản còn: %s",
				player.getName(), Utils.CURRENCY_FORMAT.format(bet), choiceText, dice[0], dice[1], dice[2], sum,
				resultText, (sum == 3 || sum == 18) ? "Thua" : (win ? "Thắng" : "Thua"), player.formatBalance());
		// lưu thông tin đã lấy vào mảng history
		history.add(log);
	}

	// hàm lưu thông tin người chơi, lần cược vào lịch sử (file.txt)
	private void printAndSaveHistory() {
		System.out.println("\n========= LỊCH SỬ CHƠI =========");
		// in từng phần tử trong mảng ra console
		history.forEach(System.out::println);

		// sử dựng try-with-resources
		try (FileWriter fw = new FileWriter("lich_su_" + player.getName() + ".txt")) {
			for (String log : history) {
				fw.write(log + "\n");
			}
			System.out.println("\nLịch sử đã được lưu vào file: lich_su_" + player.getName() + ".txt");
		} catch (IOException e) {
			System.err.println("Lỗi ghi file lịch sử: " + e.getMessage());
		}
	}
}
