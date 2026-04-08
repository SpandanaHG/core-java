class Flower {
	
	String name;
	String fragrance;
	int price;
	
	Flower(String name , String fragrance , int price)
	{
		this.name = name;
		this.fragrance = fragrance;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Running display in Flower");
		System.out.println("Name: "+this.name);
		System.out.println("Fragrance: "+this.fragrance);
		System.out.println("Price: "+this.price);
	}
}