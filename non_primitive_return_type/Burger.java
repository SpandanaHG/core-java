class Burger {
	
	String name;
	String size;
	int price;
	
	Burger(String name , String size , int price)
	{
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Running display in Burger");
		System.out.println("Name: "+this.name);
		System.out.println("Size: "+this.size);
		System.out.println("Price: "+this.price);
	}
}