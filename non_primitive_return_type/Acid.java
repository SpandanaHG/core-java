class Acid {
	
	String name;
	String strength;
	double phValue;
	
	Acid(String name , String strength , double phValue)
	{
		this.name = name;
		this.strength = strength;
		this.phValue = phValue;
	}
	
	void display()
	{
		System.out.println("Running display in Acid");
		System.out.println("Name: "+this.name);
		System.out.println("Strength: "+this.strength);
		System.out.println("pH Value: "+this.phValue);
	}
}