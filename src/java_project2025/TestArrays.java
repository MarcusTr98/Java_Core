package java_project2025;

import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
//		String[] stringArray = new String[10];
//
//		for (int i = 0; i < stringArray.length; i++) {
//			stringArray[i] = "String no " + i;
//		}
//
//		for (int i = 0; i < stringArray.length; i++) {
//			System.out.println(stringArray[i]);
//		}

		int[] ints = new int[20];

		int insertIndex = 10;
		int newValue = 123;

		// move elements below insertion point.
		for (int i = ints.length - 1; i > insertIndex; i--) {
			ints[i] = ints[i - 1];
		}

		// insert new value
		ints[insertIndex] = newValue;

		System.out.println(Arrays.toString(ints));
	}
}
