
public class AdministrationEmployee extends Employee{
	
	private contract contracts;

	public AdministrationEmployee(String name) {
		super(name, 0, "Administration", setContract(contract.TEMPORARY));
		}
	

	public contract getContracts() {
		return contracts;
	}
	public void setContracts(contract contracts) {
		this.contracts = contracts;
	}
	@Override
	public double getSalary() {
		return 18000;
	}

}
