package quanly_mayTinh;

public class Test {
	public static void main(String[] args) {
		NgaySanXuat ngay1 = new NgaySanXuat(22, 02, 1998);
		NgaySanXuat ngay2 = new NgaySanXuat(22, 1, 2025);
		NgaySanXuat ngay3 = new NgaySanXuat(12, 4, 2024);

		QuocGia quocGia1 = new QuocGia("Vn11", "Việt Nam");
		QuocGia quocGia2 = new QuocGia("Vn12", "Thái Lan");
		QuocGia quocGia3 = new QuocGia("Vn14", "Lào");

		HangSanXuat hangSanXuat1 = new HangSanXuat("ABC", quocGia3);
		HangSanXuat hangSanXuat2 = new HangSanXuat("Green", quocGia1);
		HangSanXuat hangSanXuat3 = new HangSanXuat("Red_Pink", quocGia2);

		MayTinh mt1 = new MayTinh(hangSanXuat3, ngay3, 1100000, 36);
		MayTinh mt2 = new MayTinh(hangSanXuat2, ngay1, 1502000, 12);
		MayTinh mt3 = new MayTinh(hangSanXuat1, ngay2, 1900000, 24);

		System.out.println("Thông tin máy tính 1: " + mt1);
		System.out.println("Thông tin máy tính 2: " + mt2);
		System.out.println("Thông tin máy tính 3: " + mt3);

		System.out.println("Máy tính 1 rẻ hơn máy tính 2: " + mt1.kiemTraGiaReHon(mt2));
		System.out.println("Máy tính 2 rẻ hơn máy tính 3: " + mt2.kiemTraGiaReHon(mt3));
		System.out.println("Máy tính 3 rẻ hơn máy tính 1: " + mt3.kiemTraGiaReHon(mt1));

		System.out.println("Hãng của máy tính 1: " + mt1.layTenQuocGia());
		System.out.println("Hãng của máy tính 2: " + mt2.layTenQuocGia());
		System.out.println("Hãng của máy tính 3: " + mt3.layTenQuocGia());

	}
}
