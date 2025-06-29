package quanly_SV;

public class Lop {
	private String tenLop, tenKhoa;

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public Lop(String tenLop, String tenKhoa) {
		this.tenLop = tenLop;
		this.tenKhoa = tenKhoa;
	}

	@Override
	public String toString() {
		return "Lop [tenLop=" + tenLop + ", tenKhoa=" + tenKhoa + "]";
	}

}
