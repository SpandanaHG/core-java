class ElectricityRunner {
	
	public static void main(String... values)
	{
		Electricity electricity = new SolarElectricity(210 , "AC");
		System.out.println("Voltage : "+electricity.voltage);
		System.out.println("Type : "+electricity.type);
		
		Electricity electricity1 = new SolarElectricity(120 , "DC");
		System.out.println("Voltage : "+electricity1.voltage);
		System.out.println("Type : "+electricity1.type);
	}
}