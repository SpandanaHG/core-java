class PandaRun {
	
	PandaRun()
	{
		System.out.println("No-arg constructor of the class PandaRun");
	}
	
	void info(Panda panda)
	{
		System.out.println("Running info in PandaRun");
		if (panda != null)
		{
			panda.display();
		}
		else
		{
			System.out.println("Panda is null " + panda);
		}
	}
}