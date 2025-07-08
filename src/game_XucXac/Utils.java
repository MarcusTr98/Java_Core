package game_XucXac;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Utils {
	// tạo các biến private static final
	// kiểu tiền tệ VN có chấm, phẩy ngăn cách số
	public static final Locale LOCALE_VI = new Locale("vi", "VN");
	// kiểu tiền có đơn vị đ đằng sau
	public static final NumberFormat CURRENCY_FORMAT = NumberFormat.getCurrencyInstance(LOCALE_VI);
	public static final Random RANDOM = new Random();
}
