package interface_maytinh;

public class SapXepChen implements SapXep {

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

	@Override
	public String toString() {
		return "SapXepChen";
	}
}