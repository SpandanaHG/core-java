class Store {
	
	String name;
    String location;
    String type;
    int items;
    double revenue;
	
	Store(String name , String location)
	{
		this.name = name;
		this.location = location;
		System.out.println("String , String constructor of Store");
	}
	
	Store(String name , String location , String type)
	{
		this(name , location);
		this.type = type;
		System.out.println("String , String , String constructor of Store");
	}
	
	Store(String name , String location , String type , int items , double revenue)
	{
		this(name , location , type);
		this.items = items;
		this.revenue = revenue;
		System.out.println("String , String , String , int , double constructor of Store");
	}
}