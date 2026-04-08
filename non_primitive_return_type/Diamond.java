class Diamond {
	
	String shape;
	String clarity;
	int price;
	
	Diamond(String shape , String clarity , int price)
	{
		this.shape = shape;
		this.clarity = clarity;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Running display in Diamond");
		System.out.println("Shape: "+this.shape);
		System.out.println("Clarity: "+this.clarity);
		System.out.println("Price: "+this.price);
	}
}