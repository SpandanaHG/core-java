class Jewelry {

	String brand;
	String type;
	String shopName;
	
	Jewelry(String brand , String type , String shopName)
	{
		this.brand = brand;
		this.type = type;
		this.shopName = shopName;
	}
	
	void display()
	{
		System.out.println("Running display in Jewelry");
		System.out.println("Brand: "+this.brand);
		System.out.println("Type: "+this.type);
		System.out.println("Shop Name: "+this.shopName);
	}
	
	public Diamond getDiamond()
	{
		Diamond diamond = new Diamond("Round" , "VVS1" , 500000);
		return diamond;
	}
}