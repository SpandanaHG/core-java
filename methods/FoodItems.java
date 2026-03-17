class FoodItems
{
	static double getPriceByItem(String item)
	{
		System.out.println("Executing getPriceByItem with args : " + item);

		if("dosa"==item)
		{
			System.out.println("Price is 80");
			return 80;
		}
		if("idli"==item)
		{
			System.out.println("Price is 40");
			return 40;
		}
		if("pongal"==item)
		{
			System.out.println("Price is 60");
			return 60;
		}
		if("burger"==item)
		{
			System.out.println("Price is 100");
			return 100;
		}
		if("pizza"==item)
		{
			System.out.println("Price is 150");
			return 150;
		}
		if("pasta"==item)
		{
			System.out.println("Price is 120");
			return 120;
		}
		if("noodles"==item)
		{
			System.out.println("Price is 130");
			return 130;
		}
		if("biryani"==item)
		{
			System.out.println("Price is 200");
			return 200;
		}
		if("friedrice"==item)
		{
			System.out.println("Price is 180");
			return 180;
		}
		if("paratha"==item)
		{
			System.out.println("Price is 90");
			return 90;
		}
		if("sandwich"==item)
		{
			System.out.println("Price is 70");
			return 70;
		}
		if("juice"==item)
		{
			System.out.println("Price is 50");
			return 50;
		}
		if("tea"==item)
		{
			System.out.println("Price is 20");
			return 20;
		}
		if("coffee"==item)
		{
			System.out.println("Price is 30");
			return 30;
		}
		if("milkshake"==item)
		{
			System.out.println("Price is 110");
			return 110;
		}
		if("icecream"==item)
		{
			System.out.println("Price is 60");
			return 60;
		}
		if("cake"==item)
		{
			System.out.println("Price is 140");
			return 140;
		}
		if("soup"==item)
		{
			System.out.println("Price is 80");
			return 80;
		}
		if("salad"==item)
		{
			System.out.println("Price is 90");
			return 90;
		}
		if("roll"==item)
		{
			System.out.println("Price is 100");
			return 100;
		}
		else
		{
			System.out.println("Item not found");
		}
		return -1;
	}
}