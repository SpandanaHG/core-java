class EmployeeRunner {
	
	public static void main(String... values)
	{
		System.out.println("Hierarchical Inheritance");
		
		Employee employee1 = new Developer();
		employee1.work();
		
		Employee employee2 = new Tester();
		employee2.work();
	}
}