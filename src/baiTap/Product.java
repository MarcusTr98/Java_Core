package baiTap;

import java.util.Scanner;

public class Product {
	// khởi tạo attributes private => chỉ dùng đc trong class này
	private String name;
	private double price, tax;

	// generate contructor ko tham số => dùng để gán giá trị vào sau
	public Product() {
	}

	// generate contructor đủ tham số => gọi ra ở class khác và gián trực tiếp vào
	// được
	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	// generate seter & getter => lúc này có thể gọi attribute ở các class khác bằng
	// get/set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	// function ko trả về
	// cụ thể với function này thì lấy data từ bàn phím và đưa vào attributes, dùng
	// "this."
	// vì đang ở cùng class nên vẫn dùng trực tiếp đc các attributes
	public void nhapThongTinTuBanPhim() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập tên sản phẩm: ");
		this.name = scanner.nextLine();

		System.out.print("Nhập giá sản phẩm: ");
		this.price = scanner.nextDouble();

		System.out.print("Nhập thuế (%): ");
		this.tax = scanner.nextDouble();
	}

	// vì đang ở cùng class nên vẫn dùng trực tiếp đc các attributes
	public void xuatThongTin() {
		System.out.println("Name: " + name + " price: " + price + " tax: " + tax);
	}

	// vì đang ở cùng class nên vẫn dùng trực tiếp đc các attributes
	public double getTaxPrice() {
		return price * tax;
	}

	// vì đang ở cùng class nên vẫn dùng trực tiếp đc các attributes
	public double getTotalPrice() {
		return price + getTaxPrice();
	}
}
