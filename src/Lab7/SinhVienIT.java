package Lab7;

public class SinhVienIT extends SinhVien {

	private double scoreJava, scoreHTML;

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	public SinhVienIT(double scoreJava, double scoreHTML) {
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	@Override
	public String tinhDiem() {
		return "Điểm của SV là : " + (this.scoreJava * 2 + this.scoreHTML) / 3;
	}

}
