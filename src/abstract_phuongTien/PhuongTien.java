package abstract_phuongTien;

public abstract class PhuongTien {
	protected String loaiPhuongTien;
	protected HangSanXuat hangSX;

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public HangSanXuat getHangSX() {
		return hangSX;
	}

	public void setHangSX(HangSanXuat hangSX) {
		this.hangSX = hangSX;
	}

	public PhuongTien(String loaiPhuongTien, HangSanXuat hangSX) {
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSX = hangSX;
	}

	public String layTenHangSanXuat() {
		return getHangSX().getTenHangSanXuat();
	}

	public void batDau() {
		System.out.println("start");
	}

	public void tangToc() {
		System.out.println("speed up");
	}

	public void dungLai() {
		System.out.println("stop");
	}

	public abstract double layVanToc();

	@Override
	public String toString() {
		return "PhuongTien [loaiPhuongTien=" + loaiPhuongTien + ", hangSX=" + hangSX + "]";
	}
}
