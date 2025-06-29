package abstract_phuongTien;

public class XeDap extends PhuongTien {

	public XeDap(String loaiPhuongTien, HangSanXuat hangSX) {
		super(loaiPhuongTien, hangSX);
	}

	@Override
	public double layVanToc() {
		return 5;
	}

	@Override
	public String toString() {
		return "XeDap []";
	}

}
