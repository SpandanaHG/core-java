class CarromRun{
	
	CarromRun()
	{
		System.out.println("No-arg constructor of the class CarromRun");
	}
	
	void info(Carrom carrom)
	{
		System.out.println("Running info in CarromRun");
		if (carrom != null)
		{
			carrom.display();
		}
		else
		{
			System.out.println("Carrom is null "+ carrom);
		}
	}
}