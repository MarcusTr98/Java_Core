package interface_maytinh;

public class PhanMemMayTinh implements MayTinhBoTui, SapXep {

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

	@Override
	public void sapXepTang(double[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			double key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			double key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
