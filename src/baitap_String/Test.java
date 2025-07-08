package baitap_String;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(100, "Tran Van Thanh", "Lop 1", 9);
		SinhVien sv2 = new SinhVien(100, "Nguyen Van Long", "Lop 2", 8);
		SinhVien sv3 = new SinhVien(99, "Nguyen Van An", "Lop 2", 8);

		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv3.compareTo(sv1));
		System.out.println(sv2.compareTo(sv3));
	}
}
