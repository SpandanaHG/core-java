class Tower {
	
	int height;
	String location;
	String type;
	
	Tower(int height , String location , String type)
	{
		this.height = height;
		this.location = location;
		this.type = type;
	}
	
	void display()
	{
		System.out.println("Running display in Tower");
		System.out.println("Height: "+this.height);
		System.out.println("Location: "+this.location);
		System.out.println("Type: "+this.type);
	}
}