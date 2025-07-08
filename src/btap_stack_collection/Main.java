package btap_stack_collection;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stackChuoi = new Stack<String>();
//		// đưa giá trị vào
//		stackChuoi.push("Mèo");
//		// lấy giá trị ra, xóa khỏi stack
//		stackChuoi.pop();
//		// lấy ra trị ra nhưng ko xóa khỏi stack
//		stackChuoi.peek();
//		// xóa tất cả phần tử
//		stackChuoi.clear();
//		// hàm xem có tồn tại trong stack ko?
//		stackChuoi.contains("Chó");
// 		hàm lấy size
		// stackChuoi.size();

		// ví dụ
		System.out.println("Nhập vào chuỗi: ");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			stackChuoi.push(s.charAt(i) + "");
		}

		System.out.println("Chuỗi đảo ngược:  \n");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(stackChuoi.pop());
		}

		// ví dụ từ hệ thập phân sang hệ nhị phân
		Stack<String> stackSoDu = new Stack<String>();
		System.out.println("Nhập 1 số nguyên dương từ bàn phím: ");
		int x = sc.nextInt();
		while (x > 0) {
			int soDu = x % 2;
			stackSoDu.push(soDu + "");
			x = x / 2;
		}
		System.out.println("Số nhị phân là: ");
		int n = stackSoDu.size();
		// vì pop nó lấy ra là nó xóa
		for (int i = 0; i < n; i++) {
			System.out.print(stackSoDu.pop());
		}

	}

}
