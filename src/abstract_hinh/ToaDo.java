package abstract_hinh;

public class ToaDo {
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ToaDo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "ToaDo [x=" + x + ", y=" + y + "]";
	}

}
