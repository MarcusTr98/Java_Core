package abstract_phuongTien;

public class MayBay extends PhuongTien {
	private String loaiNhienLieu;

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public MayBay(String loaiPhuongTien, HangSanXuat hangSX, String loaiNhienLieu) {
		super(loaiPhuongTien, hangSX);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		return 500;
	}

	public void catCanh() {
		System.out.println("Cất cánh");
	}

	public void haCanh() {
		System.out.println("Hạ cánh");
	}

	@Override
	public String toString() {
		return "MayBay [loaiNhienLieu=" + loaiNhienLieu + "]";
	}
}
