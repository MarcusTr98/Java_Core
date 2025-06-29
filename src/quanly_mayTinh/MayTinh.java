package quanly_mayTinh;

public class MayTinh {
	private HangSanXuat hangSanXuat;
	private NgaySanXuat ngaySanXuat;
	private double giaBan;
	private int thoiGianBaoHanh;

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public NgaySanXuat getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(NgaySanXuat ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public MayTinh(HangSanXuat hangSanXuat, NgaySanXuat ngaySanXuat, double giaBan, int thoiGianBaoHanh) {
		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuat = ngaySanXuat;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	@Override
	public String toString() {
		return "MayTinh [hangSanXuat=" + hangSanXuat + ", ngaySanXuat=" + ngaySanXuat + ", giaBan=" + giaBan
				+ ", thoiGianBaoHanh=" + thoiGianBaoHanh + "]";
	}

	public boolean kiemTraGiaReHon(MayTinh mayTinh) {
		return this.getGiaBan() < mayTinh.getGiaBan();
	}

	public String layTenQuocGia() {
		return getHangSanXuat().getQuocGia().getTenQuocGia();
	}
}
