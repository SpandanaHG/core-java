class President {
	
	String name;
	int age;
	Address address;
	
	President(String name , int age , Address address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	void displayPresident()
	{
		System.out.println("Running displayPresident in President");
		System.out.println("President name : "+this.name);
		System.out.println("Age : "+this.age);
		
		if(this.address != null)
		{
			this.address.displayAddress();
		}
		else
		{
			System.out.println("Address is null");
		}
		
	}
}