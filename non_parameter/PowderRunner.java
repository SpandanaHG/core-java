class PowderRunner {
	
	public static void main(String[] values)
	{
		Powder powder = new Powder();
		PowderRun powderRun = new PowderRun();
		
		powderRun.info(powder);
		
		powder.brand = "Lakme";
		powder.type = "Body";
		powder.weight = 200;
		powder.fragrance = "Jasmine";
		powder.isOrganic = true;
		
		powderRun.info(powder);
	}
}