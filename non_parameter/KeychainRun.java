class KeychainRun {
	
	KeychainRun()
	{
		System.out.println("No-arg constructor of the class KeychainRun");
	}
	
	void info(Keychain keychain)
	{
		System.out.println("Running info in KeychainRun");
		if (keychain != null)
		{
			keychain.display();
		}
		else
		{
			System.out.println("Keychain is null " + keychain);
		}
	}
}
