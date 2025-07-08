package game_XucXac;

public class Dice {

	// tạo ra 1 hàm roll trả về mảng int => 3 phần tử này là số điểm ra của con xúc
	// xắc
	public static int[] roll() {
		return new int[] { Utils.RANDOM.nextInt(6) + 1, Utils.RANDOM.nextInt(6) + 1, Utils.RANDOM.nextInt(6) + 1 };
	}
}
