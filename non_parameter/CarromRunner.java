class CarromRunner{
	
	public static void main(String[] values)
	{
		Carrom carrom = new Carrom();
		CarromRun carromRun = new CarromRun();
		
		carromRun.info(carrom);
		
		carrom.boardMaterial = "Plywood";
		carrom.numberOfCoins = 21;
		carrom.strikerType = "Plastic";
		carrom.boardSize = "Large";
		carrom.hasNet = false;
		
		carromRun.info(carrom);
	}
}