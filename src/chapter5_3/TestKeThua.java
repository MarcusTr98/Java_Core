package chapter5_3;

import chapter5_1.ClassKhaiBao;

public class TestKeThua extends chapter5_1.ClassKhaiBao {

	private void test() {
		ClassKhaiBao obj = new ClassKhaiBao();
		obj.thuocTinhPublic = 5;
		thuocTinhProtected = 2; // kế thừa trực tiếp
	}

	public static void main(String[] args) {
	}
}
