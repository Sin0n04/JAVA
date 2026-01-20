package empresa;

public class Person {
	private String name, dni;
	private int height, weight;

	public Person(String dni, String name, int height, int weight) {
		this.dni = dni;
		this.weight = weight;
		this.name = name;
		this.height = height;
	}

	public Person(String dni) {
		this.dni = dni;
		this.height = 0;
		this.weight = 0;
		this.name = "";
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "name: " + this.name + " weight: " + this.weight;
	}
}
