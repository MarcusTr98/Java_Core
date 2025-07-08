package interface_maytinh;

public class MayTinhVinaCall500 implements MayTinhBoTui {

	@Override
	public double cong(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double chia(double a, double b) {
		try {
			if (b != 0) {
				return a / b;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			return 0;
		}

	}

}
