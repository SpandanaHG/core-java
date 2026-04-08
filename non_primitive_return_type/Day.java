class Day {
	
	String name;
	int number;
	boolean holiday;
	
	Day(String name , int number , boolean holiday)
	{
		this.name = name;
		this.number = number;
		this.holiday = holiday;
	}
	
	void display()
	{
		System.out.println("Running display in Day");
		System.out.println("Name: "+this.name);
		System.out.println("Number: "+this.number);
		System.out.println("Holiday: "+this.holiday);
	}
}