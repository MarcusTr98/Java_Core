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

	@Override
	public String toString() {
		return id + " - " + name + " (" + major + ")";
	}
}
