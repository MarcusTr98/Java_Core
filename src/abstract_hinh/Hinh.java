package abstract_hinh;

public abstract class Hinh {
	protected ToaDo toaDo;

	public ToaDo getToaDo() {
		return toaDo;
	}

	public void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}

	public Hinh(ToaDo toaDo) {
		this.toaDo = toaDo;
	}

	abstract double tinhDienTich();
}
