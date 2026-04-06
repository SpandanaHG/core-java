class RotaterRunner {
	
	public static void main(String[] values)
	{
		Rotater rotater = new Rotater();
		RotaterRun rotaterRun = new RotaterRun();
		
		rotaterRun.info(rotater);
		
		rotater.type = "Spinner";
		rotater.color = "Red";
		rotater.speed = 10;
		rotater.material = "Metal";
		rotater.isSmooth = false;
		
		rotaterRun.info(rotater);
	}
}