class Locker {

	String location;
	int capacity;
	String color;
	
	Locker(String location , int capacity , String color)
	{
		this.location = location;
		this.capacity = capacity;
		this.color = color;
	}
	
	void display()
	{
		System.out.println("Running display in Locker");
		System.out.println("Location: "+this.location);
		System.out.println("Capacity: "+this.capacity);
		System.out.println("Color: "+this.color);
	}
	
	public Lock getLock()
	{
		Lock lock = new Lock("Steel","Key",500);
		return lock;
	}
}