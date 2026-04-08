class Laboratory {

	String labName;
	String location;
	int capacity;
	
	Laboratory(String labName , String location , int capacity)
	{
		this.labName = labName;
		this.location = location;
		this.capacity = capacity;
	}
	
	void display()
	{
		System.out.println("Running display in Laboratory");
		System.out.println("Lab Name: "+this.labName);
		System.out.println("Location: "+this.location);
		System.out.println("Capacity: "+this.capacity);
	}
	
	public Acid getAcid()
	{
		Acid acid = new Acid("HCl" , "Strong" , 1.5);
		return acid;
	}
}