class CoinRun{
	
	CoinRun()
	{
		System.out.println("No-arg constructor of CoinRun");
	}
	
	void info(Coin coin)
	{
		System.out.println("Running info in CoinRun");
		if(coin != null)
		{
			coin.display();
		}
		else
		{
			System.out.println("Coin is null "+ coin);
		}
	}
}