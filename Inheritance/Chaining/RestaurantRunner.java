class RestaurantRunner {
	
	public static void main(String... values)
	{
		Restaurant restaurant1 = new OnlineRestaurant("Food Palace", 4);
		System.out.println("Name : "+restaurant1.name);
		System.out.println("Location : "+restaurant1.location);
		System.out.println("Cuisine : "+restaurant1.cuisine);
		System.out.println("Rating : "+restaurant1.rating);
		System.out.println("Capacity : "+restaurant1.capacity);
		
		Restaurant restaurant2 = new OnlineRestaurant( "Spice Hub", "Mysore", "South Indian", 5, 120);
		System.out.println("Name : "+restaurant2.name);
		System.out.println("Location : "+restaurant2.location);
		System.out.println("Cuisine : "+restaurant2.cuisine);
		System.out.println("Rating : "+restaurant2.rating);
		System.out.println("Capacity : "+restaurant2.capacity);
	}
}