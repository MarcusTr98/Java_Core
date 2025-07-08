package interface_maytinh;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		System.out.println("Máy tính: ");
		MayTinhVinaCall500 vc500 = new MayTinhVinaCall500();
		MayTinhCasioFX570 fx570 = new MayTinhCasioFX570();

		System.out.println(" 10 chia 0 = " + fx570.chia(10, 0));
		System.out.println(" 10 cộng 2 = " + fx570.cong(10, 2));
		System.out.println(" 10 trừ 2 = " + fx570.tru(10, 2));
		System.out.println(" 10 nhân 2 = " + fx570.nhan(10, 2));

		System.out.println("\n Sắp xếp: ");
		double arr1[] = new double[] { 1, 5, 6, 8, 9, 5, 9 };
		double arr2[] = new double[] { 0, 9, 7, 6, 3, 3, 10, 5, 8 };
		SapXepChen sxChen = new SapXepChen();
		SapXepChon sxChon = new SapXepChon();

		sxChen.sapXepGiam(arr2);
		System.out.println("Sắp xếp Chèn giảm: " + Arrays.toString(arr2));
		sxChen.sapXepTang(arr2);
		System.out.println("Sắp xếp Chèn tăng: " + Arrays.toString(arr2));

		sxChon.sapXepGiam(arr1);
		System.out.println("Sắp xếp Chọn giảm: " + Arrays.toString(arr1));

		sxChon.sapXepTang(arr1);
		System.out.println("Sắp xếp Chọn tăng: " + Arrays.toString(arr1));

		System.out.println("\n Phần mềm máy tính: ");
		PhanMemMayTinh pmmt = new PhanMemMayTinh();

		pmmt.chia(10, 25);
	}
}
