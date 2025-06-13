package chapter4;

public class Student {
	// attributes
	private String name;
	private int age;
	private String address;
	private String email;

	public Student() { // tự định nghĩa khi ko có hàm tạo có tham số
	}

	public Student(String name, int age) {
		this.name = name; // nhân bản class ra
		this.age = age;
	}

	// return theo ý muốn
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name1) {
		this.name = name1;
	}

	public void setAge(int age1) {
		this.age = age1;
	}

	// class function hoặc class method
	public void learnJava() {
		System.out.println("Learn java with youtube =))");
	}

}
