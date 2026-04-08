class GardenRunner{
	
	public static void main(String... values)
	{
		Garden garden = new Garden("City Park" , 500 , "Ravi");
		garden.display();
		
		Flower flower = garden.getFlower();
		flower.display();
	}
}