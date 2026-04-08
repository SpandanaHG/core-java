class Garden {

	String location;
	int area;
	String incharge;
	
	Garden(String location , int area , String incharge)
	{
		this.location = location;
		this.area = area;
		this.incharge = incharge;
	}
	
	void display()
	{
		System.out.println("Running display in Garden");
		System.out.println("Location: "+this.location);
		System.out.println("Area: "+this.area);
		System.out.println("Incharge: "+this.incharge);
	}
	
	public Flower getFlower()
	{
		Flower flower = new Flower("Rose" , "Sweet" , 50);
		return flower;
	}
}