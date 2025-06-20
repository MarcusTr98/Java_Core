package java_project2025;

import java.util.ArrayList;
import java.util.Scanner;

public class Video36_AL {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Double> arrNumber = new ArrayList();

		while (true) {
			System.out.println("nhap vao so thuc bat ky: ");
			double input = sc.nextDouble();
			arrNumber.add(input);

			sc.nextLine(); // loại enter

			System.out.println("continue ? Y or N");
			String option = sc.nextLine();

			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}
		System.out.println("Check array: " + arrNumber);
		double sum = 0;
		for (int i = 0; i < arrNumber.size(); i++) {
			sum += arrNumber.get(i);
		}
		System.out.println("Sum = " + sum);
	}
}
