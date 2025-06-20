package chapter7;

// lớp mountainBike kế thừa từ lớp bicycle
public class MountainBike extends Bicycle {
	// attribute của mountainBike, suspension- cách dừng lại
	private String suspension;

	// generate constructor có cả supperClass
	public MountainBike(int startCadence, int startSpeed, int startGear, String suspensionType) {
		super(startCadence, startSpeed, startGear);
		this.setSuspension(suspensionType);
	}

	// generate setter, getter
	public String getSuspension() {
		return this.suspension;
	}

	public void setSuspension(String suspensionType) {
		this.suspension = suspensionType;
	}

	// generate ghi đè vào method, thêm dữ liệu về cách dừng xe
	@Override
	public void printDescription() {
		// gọi hàm printDescription của parent là bicycle ra
		super.printDescription();
		// sau đó là thêm của Mountain Bicycle
		System.out.println("The " + "MountainBike has a " + getSuspension() + " suspension.");
	}

}
