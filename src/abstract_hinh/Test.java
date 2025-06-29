package abstract_hinh;

public class Test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(10, 10);
		ToaDo td2 = new ToaDo(5, 1);
		ToaDo td3 = new ToaDo(-10, 1);

		HinhChuNhat hcn = new HinhChuNhat(td1, 10, 12);
		Diem d = new Diem(td3);
		HinhTron htron = new HinhTron(td2, 5);

		System.out.println("Diện tích hình chữ nhật: " + hcn.tinhDienTich());
		System.out.println("Diện tích hình tròn: " + htron.tinhDienTich());
		System.out.println("Diện tích điểm: " + d.tinhDienTich());

	}

}
