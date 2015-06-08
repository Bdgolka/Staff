
public class EngineeringEmployee extends Employee {

	
	public EngineeringEmployee(String name, int years, contract contract) {
		super(name, years, "Engineering", contract);
		// TODO Auto-generated constructor stub
	}
@Override
public double getSalary() {
	
	return 25000 + 2500*super.getYears();
}
}
