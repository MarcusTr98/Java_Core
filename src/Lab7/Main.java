package Lab7;

public class Main {
	public static void main(String[] args) {

		SinhVien sv1, sv2;
		sv1 = new SinhVienIT(10, 5);
		sv2 = new SinhVienCoKhi(9, 9.5);

		System.out.println(sv1.tinhDiem());
		System.out.println(sv2.tinhDiem());
	}
}
