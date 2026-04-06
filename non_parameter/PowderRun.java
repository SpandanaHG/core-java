class PowderRun {
	
	PowderRun()
	{
		System.out.println("No-arg constructor of the class PowderRun");
	}
	
	void info(Powder powder)
	{
		System.out.println("Running info in PowderRun");
		if (powder != null)
		{
			powder.display();
		}
		else
		{
			System.out.println("Powder is null " + powder);
		}
	}
}