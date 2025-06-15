package hashmap_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_HashMap {
	public static void main(String[] args) {

		// Khởi tạo danh sách sinh viên bằng HashMap
		Map<String, Student> studentMap = new HashMap<>();

		// thêm thủ công các dữ liệu vào student
		Student s1 = new Student("SV001", "Do Van P", "MKT");
		Student s2 = new Student("SV002", "Tran Thi B", "Kinh Te");
		Student s3 = new Student("SV003", "Le Van C", "Y Duoc");
		Student s4 = new Student("SV004", "Tran Ngoc D", "CNTT");

		// add các sv đã khai báo vào List
		studentMap.put(s1.id, s1);
		studentMap.put(s2.id, s2);
		studentMap.put(s3.id, s3);
		studentMap.put(s4.id, s4);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ma sinh vien can tim: ");
		String searchId = scanner.nextLine();

		// Cách 2: Dung HashMap
		// khai báo và gán start/end
		long start2 = System.nanoTime();

		// khởi tạo 1 obj found2 = lấy ra giá trị ID từ studentMap với .get(key)
		Student found2 = studentMap.get(searchId);

		// khai báo và gán end = thời gian kết thúc
		long end2 = System.nanoTime();

		// nếu found2 tìm thấy dữ liệu thì in ra found2
		if (found2 != null) {
			System.out.println("[HashMap] Tim thay: " + found2);
		} else {
			System.out.println("[HashMap] Khong tim thay sinh vien");
		}

		System.out.println("[HashMap]  Thoi gian tim kiem: " + (end2 - start2) + " ns");
	}
}
