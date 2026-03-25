class FoodMenuRunner{
	public static void main(String[] values)
	{
		String[] foods = {"Pongal" , "Tomato Rice" , "Lemon Rice" , "Palak Paneer" , "Chole" , "Fried Rice" , "Pav Bhaji" , "Veg Biryani" , "Pakora" , "Samosa" , "Sandwich" , "Pani Puri" , "Veg Cutlet" , "Bhindi Masala" , "Paneer Bhurji" , "Vegetable Momos" , "Vegetable Khichdi" , "Aloo Gobi" , "Jeera Rice" , "Paneer Tikka" , "Vegetable Pulao" , "Kadai Paneer" , "Vegetable Kurma" , "Stuffed Capsicum" , "Dal Makhani" , "Aloo Jeera" , "Vegetable Soup" , "Corn Chaat" , "Vegetable Pasta" , "Vegetable Paratha" , "Paneer Butter Masala" , "Paneer Momos"};
		for(int item = 0 ; item<foods.length ; item++)
		{
			String[] foodItems = FoodMenu.getIngredients(foods[item]);
		
			if(foodItems != null)
			{
				for(int start = 0 ; start < foodItems.length ; start++)
				{
					System.out.println("Ingredients :"+foodItems[start]);
				}
			}
		}
	}
}