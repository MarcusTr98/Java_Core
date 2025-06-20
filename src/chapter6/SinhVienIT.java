package chapter6;

public class SinhVienIT extends Student {
	private String language;

	public SinhVienIT(String language, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void getMoney() {
		System.out.println("run getMoney");
		super.info();
	}

	public void info() {
		System.out.println("run info into class SinhVienIT");
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}
}
