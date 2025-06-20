package chapter7;

public class Bicycle {
	// attribute gear-bánh răng, cadence-nhịp, speed-tốc độ
	private int gear, cadence, speed;

	// các getter và setter
	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// generate constructor đủ attribute
	public Bicycle(int gear, int cadence, int speed) {
		this.gear = gear;
		this.cadence = cadence;
		this.speed = speed;
	}

	// giống toString() => in ra dữ liệu cho tường minh hơn
	public void printDescription() {
		System.out.println("\nBike is " + "in gear " + this.gear + " with a cadence of " + this.cadence
				+ " and travelling at a speed of " + this.speed + ". ");
	}
}
