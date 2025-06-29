package quanly_veXemPhim;

import java.util.Objects;

public class BoPhim {
	private String tenPhim;
	private int namSanXuat;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private Ngay ngayChieu;

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	public Ngay getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(Ngay ngayChieu) {
		this.ngayChieu = ngayChieu;
	}

	public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu) {
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}

	@Override
	public String toString() {
		return "BoPhim [tenPhim=" + tenPhim + ", namSanXuat=" + namSanXuat + ", hangSanXuat=" + hangSanXuat + ", giaVe="
				+ giaVe + ", ngayChieu=" + ngayChieu + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(giaVe, hangSanXuat, namSanXuat, ngayChieu, tenPhim);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoPhim other = (BoPhim) obj;
		return Double.doubleToLongBits(giaVe) == Double.doubleToLongBits(other.giaVe)
				&& Objects.equals(hangSanXuat, other.hangSanXuat) && Objects.equals(namSanXuat, other.namSanXuat)
				&& Objects.equals(ngayChieu, other.ngayChieu) && Objects.equals(tenPhim, other.tenPhim);
	}

	public boolean kiemTraGiaVeReHon(BoPhim phimKhac) {
		return this.giaVe < phimKhac.giaVe;
	}

	public double giaVeKhiCoKM(double KM) {
		return giaVe * (1 - KM / 100);
	}

}
