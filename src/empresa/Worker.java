package empresa;

public class Worker extends Person {
	private int money;
	private MobilePhone phone;

	public Worker(String dni, String name, int height, int weight, int money, MobilePhone phone) {
		super(dni, name, height, weight);
		this.money = money;
		this.phone = phone;
	}

	void earnMoney(int ammount) {
		this.money += ammount;
	}

	void spendMoney(int ammount) {
		this.money -= ammount;
	}

	@Override
	public String toString() {
		return "name: " + this.getName() + " weight: " + this.getWeight() + " money: " + this.money + " phone number: "
				+ phone.getNumber() + " battery: " + phone.getBattery();
	}

	public int getMoney() {
		return money;
	}

	public void work() {
		this.phone.use();
		this.earnMoney(10);
	}
}
