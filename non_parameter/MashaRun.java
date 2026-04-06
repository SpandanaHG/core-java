class MashaRun {
	
	MashaRun()
	{
		System.out.println("No-arg constructor of the class MashaRun");
	}
	
	void info(Masha masha)
	{
		System.out.println("Running info in MashaRun");
		if (masha != null)
		{
			masha.display();
		}
		else
		{
			System.out.println("Masha is null " + masha);
		}
	}
}