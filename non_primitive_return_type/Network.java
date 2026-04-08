class Network {

	String provider;
	int range;
	String speed;
	
	Network(String provider , int range , String speed)
	{
		this.provider = provider;
		this.range = range;
		this.speed = speed;
	}
	
	void display()
	{
		System.out.println("Running display in Network");
		System.out.println("Provider: "+this.provider);
		System.out.println("Range: "+this.range);
		System.out.println("Speed: "+this.speed);
	}
	
	public Tower getTower()
	{
		Tower tower = new Tower(300 , "City" , "Signal");
		return tower;
	}
}