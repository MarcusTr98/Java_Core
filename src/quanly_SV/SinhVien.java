package quanly_SV;

public class SinhVien {
	private String MSSV, hoVaTen;
	private Ngay ngayThangNamSinh;
	private double diemTB;
	private Lop lop;

	public String getMSSV() {
		return MSSV;
	}

	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public Ngay getNgayThangNamSinh() {
		return ngayThangNamSinh;
	}

	public void setNgayThangNamSinh(Ngay ngayThangNamSinh) {
		this.ngayThangNamSinh = ngayThangNamSinh;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}

	public SinhVien(String mSSV, String hoVaTen, Ngay ngayThangNamSinh, double diemTB, Lop lop) {
		MSSV = mSSV;
		this.hoVaTen = hoVaTen;
		this.ngayThangNamSinh = ngayThangNamSinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}

	@Override
	public String toString() {
		return "SinhVien [MSSV=" + MSSV + ", hoVaTen=" + hoVaTen + ", ngayThangNamSinh=" + ngayThangNamSinh
				+ ", diemTB=" + diemTB + ", lop=" + lop + "]";
	}

	public String layTenKhoa() {
		return this.lop.getTenKhoa();
	}

	public boolean kiemTraThiDau() {
		return getDiemTB() >= 5;
	}

	public boolean kiemTraCungNgaySinh(SinhVien sv) {
		return this.ngayThangNamSinh.equals(sv.getNgayThangNamSinh());
	}

}
