package chapter7;

public class TestBicycleMain {
	public static void main(String[] args) {
		// tạo ra 3 thằng bike theo kiểu thằng parent
		Bicycle bike01, bike02, bike03;

		// thêm dữ liệu 3 thằng bike, gọi theo thằng child
		bike01 = new Bicycle(20, 10, 1);
		bike02 = new MountainBike(20, 10, 5, "Dual");
		bike03 = new RoadBike(40, 20, 8, 23);

		// in ra thông số
		bike01.printDescription();
		bike02.printDescription();
		bike03.printDescription();
	}
}
