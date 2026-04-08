class RestaurantRunner{
	
	public static void main(String... values)
	{
		Restaurant restaurant = new Restaurant("Food Hub" , "Bangalore" , "Fast Food");
		restaurant.display();
		
		Burger burger = restaurant.getBurger();
		burger.display();
	}
}