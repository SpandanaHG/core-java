class VehicleRunner {
	
	public static void main(String... values)
	{
		System.out.println("Hybrid Inheritance");
		
		Vehicle vehicle1 = new ElectricCar();
		vehicle1.move();   
		
		Vehicle vehicle2 = new Bike();
		vehicle2.move();   
	}
}