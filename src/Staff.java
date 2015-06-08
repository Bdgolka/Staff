public class Staff {

	public static void main(String[] args) {
		Employee[] empl = {
				new ManagementEmployee("Bill", 9),
				new EngineeringEmployee("Anna", 9, contract.INDEFINITE),
				new EngineeringEmployee("John", 5, contract.INDEFINITE),
				new EngineeringEmployee("Elizabeth", 3, contract.TRAINING),
				new EngineeringEmployee("Michael", 2, contract.TRAINING),
				new AdministrationEmployee("Albert")};
		System.out.println(empl[0].toString());
	}

}
