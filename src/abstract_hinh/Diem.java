package abstract_hinh;

public class Diem extends Hinh {

	public Diem(ToaDo toaDo) {
		super(toaDo);
	}

	@Override
	double tinhDienTich() {
		return 1;
	}

}
