class MickeyMouseRun {
	
	MickeyMouseRun()
	{
		System.out.println("No-arg constructor of the class MickeyMouseRun");
	}
	
	void info(MickeyMouse mickey)
	{
		System.out.println("Running info in MickeyMouseRun");
		if (mickey != null)
		{
			mickey.display();
		}
		else
		{
			System.out.println("MickeyMouse is null " + mickey);
		}
	}
}