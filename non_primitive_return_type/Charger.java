class Charger {
	
	String brand;
	String type;
	int watt;
	
	Charger(String brand , String type , int watt)
	{
		this.brand = brand;
		this.type = type;
		this.watt = watt;
	}
	
	void display()
	{
		System.out.println("Running display in Charger");
		System.out.println("Brand: "+this.brand);
		System.out.println("Type: "+this.type);
		System.out.println("Watt: "+this.watt);
	}
}