package java_project2025;

import java.util.Arrays;
import java.util.Comparator;

public class Employee {
// đề bài: sắp xếp mảng này theo tên employeee
// khai báo attribute
	public String name;
	public int employeeId;

// khai báo contructor
	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public static void main(String[] args) {
// tạo ra 1 array có 3 phần tử
		Employee[] employeeArray = new Employee[3];

// gán từng phần tử vào mảng với index từ 0->3
		employeeArray[0] = new Employee("Xander", 1);
		employeeArray[1] = new Employee("John", 3);
		employeeArray[2] = new Employee("Anna", 2);

// import thư viện Arrays, sử dụng .sort cái employeeArray 
		Arrays.sort(employeeArray, new Comparator<Employee>() {
			// generate code compare => so sánh e1 và e2
			@Override
			public int compare(Employee e1, Employee e2) {
				// So sánh chuỗi tên theo bảng chữ cái
				// trả về Số âm nếu e1.name < e2.name; 0 nếu bằng nhau; Số dương nếu e1.name >
				// e2.name
				return e1.name.compareTo(e2.name);
				// còn nếu muốn sort ID thì return e1.employeeId - e2.employeeId;
			}
		});

// chạy vòng for để in lần lượt name ra màn hình console
		for (int i = 0; i < employeeArray.length; i++) {
			System.out.println(employeeArray[i].name);
		}
	}

}
