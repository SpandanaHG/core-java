class WaterRunner {
	
	public static void main(String[] values)
	{
		Water water = new Water();
		WaterRun waterRun = new WaterRun();
		
		waterRun.info(water);
		
		water.type = "Tap";
		water.color = "Slight Blue";
		water.quantity = 2;
		water.state = "Liquid";
		water.isDrinkable = false;
		
		waterRun.info(water);
	}
}