package chapter7;

public class RoadBike extends Bicycle {
	// In millimeters - (mm)
	// attribute tireWidth- độ dày lốp
	private int tireWidth;

	// genereat constructor có dùng lại super
	public RoadBike(int startCadence, int startSpeed, int startGear, int newTireWidth) {
		super(startCadence, startSpeed, startGear);
		this.setTireWidth(newTireWidth);
	}

	// getter và setter
	public int getTireWidth() {
		return this.tireWidth;
	}

	public void setTireWidth(int newTireWidth) {
		this.tireWidth = newTireWidth;
	}

	// generate ghi đè vào method => thêm dữ liệu về độ dày lốp
	@Override
	public void printDescription() {
		super.printDescription();
		System.out.println("The RoadBike" + " has " + getTireWidth() + " MM tires.");
	}

}
