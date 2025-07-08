package interface_maytinh;

public class SapXepChon implements SapXep {

	@Override
	public void sapXepTang(double[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			swap(arr, i, minIdx);
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int maxIdx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[maxIdx]) {
					maxIdx = j;
				}
			}
			swap(arr, i, maxIdx);
		}
	}

	private void swap(double[] arr, int i, int j) {
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	@Override
	public String toString() {
		return "SapXepChon";
	}
}
