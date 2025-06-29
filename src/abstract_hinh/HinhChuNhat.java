package abstract_hinh;

public class HinhChuNhat extends Hinh {
	private double chieuRong, chieuDai;

	public HinhChuNhat(ToaDo toaDo, double chieuRong, double chieuDai) {
		super(toaDo);
		this.chieuRong = chieuRong;
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	@Override
	double tinhDienTich() {
		return (this.getChieuDai() + this.getChieuRong()) * 2;
	}

}
