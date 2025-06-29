package abstract_phuongTien;

public class HangSanXuat {
	private String tenHangSanXuat;
	private QuocGia quocGia;

	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}

	public QuocGia getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}

	public HangSanXuat(String tenHangSanXuat, QuocGia qg1) {
		this.tenHangSanXuat = tenHangSanXuat;
		this.quocGia = qg1;
	}

	@Override
	public String toString() {
		return "HangSanXuat [tenHangSanXuat=" + tenHangSanXuat + ", quocGia=" + quocGia + "]";
	}
}
