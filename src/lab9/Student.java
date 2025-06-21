package lab9;

public class Student {
	private int maSV;
	private String hoTen;
	private double diem;
	private int tuoi;

	public Student(int maSV, String hoTen, double diem, int tuoi) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diem = diem;
		this.tuoi = tuoi;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	@Override
	public String toString() {
		return "Student [maSV=" + maSV + ", hoTen=" + hoTen + ", diem=" + diem + ", tuoi=" + tuoi + "]";
	}

}
