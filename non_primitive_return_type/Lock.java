class Lock {
	
	String material;
	String type;
	int price;
	
	Lock(String material , String type , int price)
	{
		this.material = material;
		this.type = type;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Running display in Lock");
		System.out.println("Material: "+this.material);
		System.out.println("Type: "+this.type);
		System.out.println("Price: "+this.price);
	}
}