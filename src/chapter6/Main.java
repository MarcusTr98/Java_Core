package chapter6;

public class Main {
	public static void main(String[] args) {
		System.out.println("run Main");
		SinhVienIT it1 = new SinhVienIT("Java", "SD01", "Minh", 99, 0.5);
		it1.getMoney();
		it1.info();
		System.out.println("language: " + it1.getLanguage());
		// gọi được ra attribute id, của cha
		System.out.println("ID: " + it1.id);

		SinhVienCoKhi ck1 = new SinhVienCoKhi("Điện 3 pha", "CK01", "Lam", 88, 0.45);
		System.out.println("skill: " + ck1.getSkill());
		System.out.println("ID: " + ck1.id);
	}
}
