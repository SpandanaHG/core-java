class CoinRunner{
	
	public static void main(String... values)
	{
		CoinRun coinRun = new CoinRun();
		Coin coin = new Coin();
		
		coinRun.info(coin);
		
		coin.rupee = 10;
		coin.material = "Iron";
		
		coinRun.info(coin);
	}
}