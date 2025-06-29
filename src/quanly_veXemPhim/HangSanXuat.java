package quanly_veXemPhim;

public class HangSanXuat {
	private String tenHang, quocGia;

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}

	public HangSanXuat(String tenHang, String quocGia) {
		this.tenHang = tenHang;
		this.quocGia = quocGia;
	}

	@Override
	public String toString() {
		return "HangSanXuat [tenHang=" + tenHang + ", quocGia=" + quocGia + "]";
	}

}
