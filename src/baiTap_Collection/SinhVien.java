package baiTap_Collection;

import java.util.Objects;

public class SinhVien {
	private String MaSV, hoTen;
	private int namSinh;
	private float diemTB;

	public SinhVien(String maSV, String hoTen, int namSinh, float diemTB) {
		MaSV = maSV;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}

	public SinhVien(String maSV) {
		super();
		MaSV = maSV;
	}

	public String getMaSV() {
		return MaSV;
	}

	public void setMaSV(String maSV) {
		MaSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	@Override
	public String toString() {
		return "SinhVien [MaSV=" + MaSV + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", diemTB=" + diemTB + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(MaSV, diemTB, hoTen, namSinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(MaSV, other.MaSV);
	}

}
