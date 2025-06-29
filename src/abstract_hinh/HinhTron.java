package abstract_hinh;

public class HinhTron extends Hinh {
	private double banKinh;

	public HinhTron(ToaDo toaDo, double banKinh) {
		super(toaDo);
		this.banKinh = banKinh;
	}

	@Override
	double tinhDienTich() {
		return Math.PI * Math.pow(banKinh, 2);
	}

}
