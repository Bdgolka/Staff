public class ManagementEmployee extends Employee {

	private contract contracts;

	public ManagementEmployee(String name, int years) {
		super(name, years, "Management", getContract().INDEFINITE);
	}

	public contract getContracts() {
		return contracts;
	}

	public void setContracts(contract contracts) {
		this.contracts = contracts;
	}

	@Override
	public double getSalary() {
		return 40000 + super.getYears() * 6000;
	}
}
