class RotaterRun {
	
	RotaterRun()
	{
		System.out.println("No-arg constructor of the class RotaterRun");
	}
	
	void info(Rotater rotater)
	{
		System.out.println("Running info in RotaterRun");
		if (rotater != null)
		{
			rotater.display();
		}
		else
		{
			System.out.println("Rotater is null " + rotater);
		}
	}
}