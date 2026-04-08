class Restaurant {

	String name;
	String location;
	String cuisine;
	
	Restaurant(String name , String location , String cuisine)
	{
		this.name = name;
		this.location = location;
		this.cuisine = cuisine;
	}
	
	void display()
	{
		System.out.println("Running display in Restaurant");
		System.out.println("Name: "+this.name);
		System.out.println("Location: "+this.location);
		System.out.println("Cuisine: "+this.cuisine);
	}
	
	public Burger getBurger()
	{
		Burger burger = new Burger("Cheese Burger" , "Medium" , 120);
		return burger;
	}
}