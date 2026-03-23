class PlantName{
	public static void main(String[] values)
	{
		String plant1 = "Neem";
		String plant2 = "Tulsi";
		String plant3 = "Aloe Vera";
		String plant4 = "Bamboo";
		String plant5 = "Rose";
		String plant6 = "Sunflower";
		String plant7 = "Cactus";
		String plant8 = "Mint";
		String plant9 = "Coriander";
		String plant10 = "Banana Plant";
		String plant11 = "Mango Tree";
		String plant12 = "Coconut Tree";
		String plant13 = "Peepal Tree";
		String plant14 = "Banyan Tree";
		String plant15 = "Lavender";
		String plant16 = "Jasmine";
		String plant17 = "Hibiscus";
		String plant18 = "Money Plant";
		String plant19 = "Spinach";
		String plant20 = "Carrot Plant";
		String plant21 = "Tomato Plant";
		String plant22 = "Potato Plant";
		String plant23 = "Onion Plant";
		String plant24 = "Garlic Plant";
		String plant25 = "Chili Plant";
		
		String[] plants = {plant1, plant2, plant3, plant4, plant5, plant6, plant7, plant8, plant9, plant10, plant11, plant12, plant13, plant14, plant15, plant16, plant17, plant18, plant19, plant20, plant21, plant22, plant23, plant24, plant25};
		
		for(int start=24 ; start >=0 ; start--)
		{
			System.out.println("Car Model at position "+start+ " is :"+plants[start]);
		}	
		System.out.println(plants[25]);
	}
}