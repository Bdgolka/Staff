import java.util.function.ToIntFunction;

public class Employee implements Employed {

	private String name;
	private static contract contract;
	private int years;
	private String department;

	public Employee(String name, int years, String department, contract contract) {
		this.name = name;
		this.contract=contract;
		this.years = years;		
		this.department = department;
	}

	public static contract getContract() {
			return contract;
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
		
		String type="";
	if(contract.equals(0))
			type = "temporary";
	else if(contract.equals(1))
		type = "training";
	else if(contract.equals(2))
		type = "indefinite";
	else
	throw new IllegalArgumentException();
	
		return getName()+": "+getDepartment()+" department";
		 
	}

}
