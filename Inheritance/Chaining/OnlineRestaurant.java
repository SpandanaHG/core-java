class OnlineRestaurant extends Restaurant {
	
	OnlineRestaurant(String name , int rating)
	{
		super(name,rating);
	}
	
	OnlineRestaurant(String name , String location , String cuisine , int rating , int capacity)
	{
		super(name,location,cuisine,rating,capacity);
	}
	
}