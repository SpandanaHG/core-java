class Desert {

	String name;
	String region;
	int temperature;
	
	Desert(String name , String region , int temperature)
	{
		this.name = name;
		this.region = region;
		this.temperature = temperature;
	}
	
	void display()
	{
		System.out.println("Running display in Desert");
		System.out.println("Name: "+this.name);
		System.out.println("Region: "+this.region);
		System.out.println("Temperature: "+this.temperature);
	}
	
	public Sand getSand()
	{
		Sand sand = new Sand("Fine" , "Rajasthan" , "Smooth");
		return sand;
	}
}