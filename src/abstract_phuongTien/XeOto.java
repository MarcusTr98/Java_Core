package abstract_phuongTien;

public class XeOto extends PhuongTien {

	private String loaiNhienLieu;

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public XeOto(String loaiPhuongTien, HangSanXuat hangSX, String loaiNhienLieu) {
		super(loaiPhuongTien, hangSX);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		return 100;
	}

	@Override
	public String toString() {
		return "XeOto [loaiNhienLieu=" + loaiNhienLieu + "]";
	}

}
