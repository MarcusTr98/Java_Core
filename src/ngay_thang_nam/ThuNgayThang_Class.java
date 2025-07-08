package ngay_thang_nam;

import java.sql.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class ThuNgayThang_Class {
	public static void main(String[] args) {
		// hàm láy thời gian
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			System.out.println("Test");

		}
		long t2 = System.currentTimeMillis();
		System.out.println("Trước khi chạy for: " + t1);
		System.out.println("Sau khi chạy for: " + t2);

		System.out.println("Tổng thời gian: " + (t2 - t1) + "mls.");
		System.out.println("Tổng thời gian: " + (t2 - t1) / 1000 + "s.");

		// timeUnit chuyển đổi đơn vị
		System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(t2));

		// Date => lưu xuống csdl
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getDay() + "/" + d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));

		// Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.YEAR));
		c.add(Calendar.HOUR, 30);
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.YEAR));
	}
}
