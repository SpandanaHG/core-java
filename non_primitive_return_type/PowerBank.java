class PowerBank {

	String model;
	int capacity;
	String color;
	
	PowerBank(String model , int capacity , String color)
	{
		this.model = model;
		this.capacity = capacity;
		this.color = color;
	}
	
	void display()
	{
		System.out.println("Running display in PowerBank");
		System.out.println("Model: "+this.model);
		System.out.println("Capacity: "+this.capacity);
		System.out.println("Color: "+this.color);
	}
	
	public Charger getCharger()
	{
		Charger charger = new Charger("Samsung","Fast",25);
		return charger;
	}
}