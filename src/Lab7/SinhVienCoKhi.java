package Lab7;

public class SinhVienCoKhi extends SinhVien {

	private double scoreCNC, scorePLC;

	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}

	public SinhVienCoKhi(double scoreCNC, double scorePLC) {
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	@Override
	public String tinhDiem() {
		return "Điểm của SV là : " + (this.scoreCNC + this.scorePLC) / 2;
	}

}
