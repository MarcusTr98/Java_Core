package java_project2025;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapAndHashMap {
	public static void main(String[] args) {
// khai báo 1 Map <key = string, value = string> tên là student = 1 hashmap rỗng
		Map<String, String> students = new HashMap<>();

		// Thêm sinh viên bằng .put(key, value)
		students.put("SV001", "Nguyen Van A");
		students.put("SV002", "Tran Thi B");
		students.put("SV003", "Le Van C");

		// Hiển thị danh sách sinh viên,
		System.out.println("Danh sách sinh viên:");

		// .entrySet() lấy danh sách, tập hợp map
		for (Map.Entry<String, String> entry : students.entrySet()) {
			// .getKey() => lấy key, getValue() => lấy value
			System.out.println("Mã: " + entry.getKey() + ", Tên: " + entry.getValue());
		}

		// Tìm kiếm sinh viên theo mã
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nNhập mã sinh viên cần tìm: ");
		String searchId = scanner.nextLine();

		// .containsKey() => kiểm tra xem key có tồn tại ko. với value tương tự
		if (students.containsKey(searchId)) {
			System.out.println("=> Tên sinh viên: " + students.get(searchId));
		} else {
			System.out.println("=> Không tìm thấy sinh viên với mã: " + searchId);
		}

		// Xoá sinh viên
		System.out.print("\nNhập mã sinh viên cần xoá: ");
		String deleteId = scanner.nextLine();

		// .remove() là xóa theo key
		if (students.remove(deleteId) != null) {
			System.out.println("=> Đã xoá sinh viên có mã: " + deleteId);
		} else {
			System.out.println("=> Không tìm thấy sinh viên để xoá.");
		}

		// In lại danh sách sau xoá
		System.out.println("\nDanh sách còn lại:");
		for (Map.Entry<String, String> entry : students.entrySet()) {
			System.out.println("Mã: " + entry.getKey() + ", Tên: " + entry.getValue());
		}

		scanner.close();
	}
}
