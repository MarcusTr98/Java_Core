package baiTap;

public class Main {
	public static void main(String[] args) {
		// khởi tạo 1 object là "pro" sau đó gọi contructor ra và gán giá trị vào
		Product pro = new Product("Minh", 200, 0.1);

		// dùng object để gọi các function ra thực thi
		pro.nhapThongTinTuBanPhim();
		pro.xuatThongTin();
		System.out.println("tax = " + pro.getTaxPrice());
		System.out.println("total price after tax = " + pro.getTotalPrice());

	}
}
