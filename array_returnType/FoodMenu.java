class FoodMenu{
	static String[] getIngredients(String item)
	{
		System.out.println("Executing getIngredients in FoodMenu");
		if(item == null)
		{
			System.out.println("Invalid Food Item ");
			return null;
		}
		System.out.println("The Ingredients of the food item "+item+" is");
		if(item == "Pongal")
		{
			String[] ingredients = {"Rice", "Moong dal", "Black pepper", "Cumin seeds", "Ginger", "Ghee", "Cashews"};
			return ingredients;
		}
		if(item == "Tomato Rice")
		{
			String[] ingredients = {"Rice", "Tomato", "Onion", "Green chilli", "Ginger", "Garlic", "Mustard seeds", "Curry leaves", "Cumin seeds", "Turmeric powder", "Red chilli powder", "Coriander powder", "Salt", "Oil"};
			return ingredients;
		}
		if(item == "Lemon Rice")
		{
			String[] ingredients = {"Rice", "Lemon juice", "Mustard seeds", "Urad dal", "Chana dal", "Peanuts", "Curry leaves", "Green chilli", "Turmeric powder", "Chilli powder", "Asafoetida (hing)", "Salt", "Oil"};
			return ingredients;
		}
		if(item == "Palak Paneer")
		{
			String[] ingredients = {"Spinach", "Paneer", "Onion", "Garlic", "Ginger", "Green chilli", "Cumin seeds", "Turmeric powder", "Garam masala", "Salt", "Cream"};
			return ingredients;
		}
		if(item == "Chole")
		{
			String[] ingredients = {"Chickpeas", "Onion", "Tomato", "Ginger", "Garlic", "Bay leaf", "Cloves", "Cinnamon", "Black pepper", "Cumin seeds", "Coriander powder", "Turmeric powder", "Red chilli powder", "Garam masala", "Amchur powder", "Salt", "Oil"};
			return ingredients;
		}
		if(item == "Paneer Butter Masala")
		{
			String[] ingredients = {"Paneer", "Butter", "Tomato puree", "Cream", "Onion", "Ginger", "Garlic", "Cashew paste", "Bay leaf", "Cloves", "Cinnamon", "Cardamom", "Kashmiri red chilli powder", "Turmeric powder", "Garam masala", "Coriander powder", "Salt"};
			return ingredients;
		}
		if(item == "Fried Rice")
		{
			String[] ingredients = {"Cooked rice", "Carrot", "Beans", "Capsicum", "Spring onion", "Garlic", "Soy sauce",  "Schezwan Sauce", "Vinegar", "Black pepper powder", "Salt", "Oil"};
			return ingredients;
		}
		if(item == "Pav Bhaji")
		{
			String[] ingredients = {"Potato", "Tomato", "Peas", "Capsicum", "Onion", "Butter", "Pav bread", "Cumin seeds", "Red chilli powder", "Turmeric powder", "Coriander powder", "Garam masala", "Salt"};
			return ingredients;
		}
		if(item == "Veg Biryani")
		{
			String[] ingredients = {"Basmati rice", "Carrot", "Beans", "Peas", "Potato", "Onion", "Tomato", "Yogurt", "Mint leaves", "Coriander leaves", "Bay leaf", "Cloves", "Cinnamon", "Cardamom", "Star anise", "Black pepper", "Cumin seeds", "Turmeric powder", "Red chilli powder", "Garam masala", "Salt", "Oil" , "Ghee"};
			return ingredients;
		}
		if(item == "Pakora")
		{
			String[] ingredients = {"Gram flour", "Onion" ,"Potato", "Green chilli", "Ajwain", "Turmeric powder", "Red chilli powder", "Salt", "Oil"};
			return ingredients;
		}
		if(item == "Samosa")
		{
			String[] ingredients = {"Maida", "Potato", "Peas", "Onion", "Green chilli", "Ginger", "Cumin seeds", "Coriander powder", "Garam masala", "Turmeric powder", "Red chilli powder", "Salt", "Oil"};
			return ingredients;
		}
		if(item == "Sandwich")
		{
			String[] ingredients = {"Bread", "Butter", "Cucumber", "Tomato", "Onion", "Cheese", "Black pepper", "Salt"};
			return ingredients;
		}
		if(item == "Pani Puri")
		{
			String[] ingredients = {"Puri", "Potato", "Chickpeas", "Onion", "Tamarind chutney", "Mint", "Coriander", "Green chilli", "Cumin powder", "Black salt", "Chaat masala", "Salt" , "Water"};
			return ingredients;
		}
		if(item == "Veg Cutlet")
		{
			String[] ingredients = {"Potato", "Carrot", "Beans", "Peas", "Onion", "Green chilli", "Ginger", "Bread crumbs", "Cumin powder", "Coriander powder", "Garam masala", "Salt", "Oil"};
			return ingredients;
		}
		if(item == "Bhindi Masala")
		{
			String[] ingredients = {"Ladyfinger", "Onion", "Tomato", "Cumin seeds", "Turmeric powder", "Red chilli powder", "Coriander powder", "Garam masala", "Salt", "Oil"};
			return ingredients;
		}
		if(item.equals("Paneer Bhurji"))
		{
			String[] ingredients = {"Paneer", "Onion", "Tomato", "Green chilli", "Ginger", "Garlic", "Cumin seeds", "Turmeric powder", "Red chilli powder", "Garam masala", "Salt", "Oil"};
			return ingredients;
		}
		if(item == "Vegetable Khichdi")
		{
			String[] ingredients = {"Rice", "Moong dal", "Carrot", "Beans", "Peas", "Cumin seeds", "Turmeric powder", "Salt", "Ghee"};
			return ingredients;
		}
		if(item == "Vegetable Momos")
		{
			String[] ingredients = {"Maida", "Cabbage", "Carrot", "Onion", "Garlic", "Ginger", "Soy sauce", "Black pepper", "Salt"};
			return ingredients;
		}
		if(item == "Aloo Gobi")
		{
			String[] ingredients = {"Potato", "Cauliflower", "Onion", "Tomato", "Ginger", "Garlic", "Green chilli", "Cumin seeds", "Turmeric powder", "Red chilli powder", "Coriander powder", "Garam masala", "Salt", "Oil"};
			return ingredients;
		}
		if(item == "Jeera Rice")
		{
			String[] ingredients = {"Rice", "Cumin seeds", "Bay leaf", "Cloves", "Cinnamon", "Green chilli", "Salt", "Ghee"};
			return ingredients;
		}
		if(item == "Paneer Tikka")
		{
			String[] ingredients = {"Paneer", "Yogurt", "Ginger garlic paste", "Red chilli powder", "Turmeric powder", "Garam masala", "Cumin powder", "Coriander powder", "Lemon juice", "Salt"};
			return ingredients;
		}
		if(item == "Vegetable Pulao")
		{
			String[] ingredients = {"Rice", "Carrot", "Beans", "Peas", "Onion", "Ginger", "Garlic", "Bay leaf", "Cloves", "Cinnamon", "Cardamom", "Cumin seeds", "Turmeric powder", "Salt", "Oil"};
			return ingredients;
		}

		if(item == "Kadai Paneer")
		{
			String[] ingredients = {"Paneer", "Capsicum", "Onion", "Tomato", "Ginger", "Garlic", "Cumin seeds", "Coriander seeds", "Red chilli powder", "Garam masala", "Turmeric powder", "Salt", "Oil"};
			return ingredients;
		}

		if(item == "Vegetable Kurma")
		{
			String[] ingredients = {"Mixed vegetables", "Coconut", "Onion", "Tomato", "Ginger", "Garlic", "Poppy seeds", "Cashews", "Cloves", "Cinnamon", "Cardamom", "Cumin seeds", "Turmeric powder", "Salt", "Oil"};
			return ingredients;
		}

		if(item == "Stuffed Capsicum")
		{
			String[] ingredients = {"Capsicum", "Potato", "Onion", "Green chilli", "Turmeric powder", "Red chilli powder", "Coriander powder", "Garam masala", "Salt", "Oil"};
			return ingredients;
		}

		if(item == "Dal Makhani")
		{
			String[] ingredients = {"Black gram", "Kidney beans", "Butter", "Cream", "Onion", "Tomato", "Ginger", "Garlic", "Cumin seeds", "Garam masala", "Red chilli powder", "Salt"};
			return ingredients;
		}

		if(item == "Aloo Jeera")
		{
			String[] ingredients = {"Potato", "Cumin seeds", "Green chilli", "Turmeric powder", "Red chilli powder", "Coriander powder", "Salt", "Oil"};
			return ingredients;
		}

		if(item == "Vegetable Soup")
		{
			String[] ingredients = {"Carrot", "Beans", "Cabbage", "Corn", "Garlic", "Black pepper", "Salt", "Water"};
			return ingredients;
		}

		if(item == "Corn Chaat")
		{
			String[] ingredients = {"Sweet corn", "Onion", "Tomato", "Green chilli", "Cumin powder", "Chaat masala", "Lemon juice", "Salt"};
			return ingredients;
		}

		if(item == "Vegetable Pasta")
		{
			String[] ingredients = {"Pasta", "Tomato sauce", "Garlic", "Onion", "Capsicum", "Oregano", "Black pepper", "Salt", "Oil"};
			return ingredients;
		}

		if(item == "Vegetable Paratha")
		{
			String[] ingredients = {"Wheat flour", "Mixed vegetables", "Green chilli", "Coriander powder", "Cumin powder", "Garam masala", "Salt", "Oil"};
			return ingredients;
		}
		else
		{
			System.out.println("Food item not found");
			return null;
		}
	}
}