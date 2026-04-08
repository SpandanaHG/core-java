class Warrior {

	String name;
	int age;
	String kingdom;
	
	Warrior(String name , int age , String kingdom)
	{
		this.name = name;
		this.age = age;
		this.kingdom = kingdom;
	}
	
	void display()
	{
		System.out.println("Running display in Warrior");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Kingdom: "+this.kingdom);
	}
	
	public Sword getSword()
	{
		Sword sword = new Sword("Long" , "Steel" , 40);
		return sword;
	}
}