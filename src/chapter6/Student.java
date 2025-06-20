package chapter6;

public abstract class Student {
	protected String id, name;
	protected double price, tax;

	abstract void tinhDiem();

	public Student(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public double getPriceTax() {
		return price * tax;
	}

	public void info() {
		System.out.println("run info parent");
	}
}
