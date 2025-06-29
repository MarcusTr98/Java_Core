package onTap;

public class Test_myDate {

	public static void main(String[] args) {
		MyDate md = new MyDate(22, 02, 1998);
		MyDate md1 = new MyDate(27, 9, 1988);
		MyDate md2 = new MyDate(12, 2, 2025);
		MyDate md3 = new MyDate(12, 2, 2025);
		System.out.println(md);

		// set dữ liệu vào vẫn phải đáp ứng điều kiện của hàm set
		md.setDay(21);
		System.out.println("day: " + md.getDay());

		System.out.println("month: " + md.getMonth());
		System.out.println("year: " + md.getYear());

		System.out.println("md so sanh bang md1: " + md.equals(md1));
		System.out.println("md2 so sanh bang md3: " + md2.equals(md3));
	}
}
