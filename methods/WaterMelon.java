class WaterMelon
{
	static double getPriceByQuantity(int quantity)
	{
		System.out.println("Executing getPriceByQuantity with args : "+quantity);

		if(quantity == 1)
		{
			System.out.println("Price is 50");
			return 50;
		}
		if(quantity == 2)
		{
			System.out.println("Price is 100");
			return 100;
		}
		if(quantity == 3)
		{
			System.out.println("Price is 150");
			return 150;
		}
		if(quantity == 4)
		{
			System.out.println("Price is 200");
			return 200;
		}
		if(quantity == 5)
		{
			System.out.println("Price is 250");
			return 250;
		}
		if(quantity == 6)
		{
			System.out.println("Price is 300");
			return 300;
		}
		if(quantity == 7)
		{
			System.out.println("Price is 350");
			return 350;
		}
		if(quantity == 8)
		{
			System.out.println("Price is 400");
			return 400;
		}
		if(quantity == 9)
		{
			System.out.println("Price is 450");
			return 450;
		}
		if(quantity == 10)
		{
			System.out.println("Price is 500");
			return 500;
		}
		else
		{
			System.out.println("Quantity not found");
		}
		return -1;
	}
}