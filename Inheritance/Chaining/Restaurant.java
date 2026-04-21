class Restaurant {
	
	String name;
    String location;
    String cuisine;
    int rating;
    int capacity;
	
	Restaurant(String name , int rating)
	{
		this.name = name;
		this.rating = rating;
	}
	
	Restaurant(String name , String location , String cuisine , int rating , int capacity)
	{
		this.name = name;
		this.location = location;
		this.cuisine = cuisine;
		this.rating = rating;
		this.capacity = capacity;
	}
}