public class Employee implements Employed {

	private String name;
	private static contract contract;
	private int years;
	private String department;

	public Employee(String name, int years, String department, contract contract) {
		this.name = name;
		setContract(contract);
		this.years = years;		
		this.department = department;
	}

	public static String getContract() {
		if(contract.equals(0)){
			return "temporary";
		}
		else 
		throw new IllegalArgumentException();
			
	}

	public void setContract(contract contract) {
		this.contract = contract;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	public String toString(){
		return getName()+": "+getDepartment()+" department";
		
	}

}
