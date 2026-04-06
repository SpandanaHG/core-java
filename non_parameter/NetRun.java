class NetRun {
	
	NetRun()
	{
		System.out.println("No-arg constructor of the class NetRun");
	}
	
	void info(Net net)
	{
		System.out.println("Running info in NetRun");
		if (net != null)
		{
			net.display();
		}
		else
		{
			System.out.println("Net is null " + net);
		}
	}
}