package hashmap_map;

public class Student {
	// tạo khai báo attribute
	String id;
	String name;
	String major;

	// khai báo hàm tạo
	public Student(String id, String name, String major) {
		this.id = id;
		this.name = name;
		this.major = major;
	}

	// Phương thức toString(): Là phương thức có sẵn trong lớp Object – lớp cha của
	// mọi lớp trong Java.
	// Ghi đè toString() giúp tùy chỉnh thông tin hiển thị khi đối tượng được in ra

	@Override
	public String toString() {
		return id + " - " + name + " (" + major + ")";
	}
}
