package btap_kethua;

public class Animal {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println("Nhăm nhăm");
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

}
