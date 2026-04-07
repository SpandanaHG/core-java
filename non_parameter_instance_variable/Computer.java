class Computer{
	
	String brand;
    String processor;
    int ram;
	Monitor monitor;
	
	Computer(String brand , int ram)
	{
		System.out.println("String , int constructor");
		this.brand = brand;
		this.ram = ram;
		System.out.println("Brand: "+this.brand);
		System.out.println("RAM: "+this.ram);
		System.out.println("Procrssor: "+this.processor);
	}
	
	void info()
	{
		System.out.println("Running info in Computer");
		if(this.monitor != null)
		{
			this.monitor.display();
		}
		else
		{
			System.out.println("Invalid monitor");
		}
	}
}