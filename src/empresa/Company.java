package empresa;

public class Company {
	private String name;
	private double profit;
	private Worker owner = null, manager = null;

	public Company(String name, double profit, Worker owner) {
		this.name = name;
		this.profit = profit;
		this.owner = owner;
	}

	public void hireManager(Worker other) {
		this.manager = other;
	}

	public void work() {
		this.manager.work();
		this.owner.work();
		this.profit += 100;
	}

	public Worker getManager() {
		return manager;
	}

	public Worker getOwner() {
		return owner;
	}

	@Override
	public String toString() {
		if (owner == null) {
			return "name: " + this.name + " profit: " + profit + " manager: " + getManager().toString();
		} else {
			if (manager == null) {
				return "name: " + this.name + " profit: " + profit + " owner: " + getOwner().toString();
			}
			return "name: " + this.name + " profit: " + profit;
		}
	}

}
