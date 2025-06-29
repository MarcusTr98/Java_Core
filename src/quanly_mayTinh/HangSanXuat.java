package quanly_mayTinh;

public class HangSanXuat {
	private String tenHang;
	private QuocGia quocGia;

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public QuocGia getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}

	public HangSanXuat(String tenHang, QuocGia quocGia) {
		this.tenHang = tenHang;
		this.quocGia = quocGia;
	}

	@Override
	public String toString() {
		return "HangSanXuat [tenHang=" + tenHang + ", quocGia=" + quocGia + "]";
	}

}
