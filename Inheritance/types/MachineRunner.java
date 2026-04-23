class MachineRunner {
	
	public static void main(String... values)
	{
		System.out.println("Multilevel Inheritance");
		
		Machine machine = new Laptop();
		machine.start();   
	}
}