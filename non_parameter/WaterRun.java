class WaterRun {
	
	WaterRun()
	{
		System.out.println("No-arg constructor of the class WaterRun");
	}
	
	void info(Water water)
	{
		System.out.println("Running info in WaterRun");
		if (water != null)
		{
			water.display();
		}
		else
		{
			System.out.println("Water is null " + water);
		}
	}
}