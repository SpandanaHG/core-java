class ElectricCar extends Car {
	
	@Override
	void move()
	{
		System.out.println("Running move in ElectricCar");
	}
	
	void charge()
	{
		System.out.println("Running charge in ElectricCar");
	}
}