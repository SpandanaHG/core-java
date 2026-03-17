class TissuePaper
{
	static double getPriceByThickness(int thickness)
	{
		System.out.println("Executing getPriceByThickness with args : "+thickness);
		if(thickness == 1)
		{
			System.out.println("Price is 10");
			return 10;
		}
		if(thickness == 2)
		{
			System.out.println("Price is 20");
			return 20;
		}
		if(thickness == 3)
		{
			System.out.println("Price is 30");
			return 30;
		}
		if(thickness == 4)
		{
			System.out.println("Price is 40");
			return 40;
		}
		if(thickness == 5)
		{
			System.out.println("Price is 50");
			return 50;
		}
		if(thickness == 6)
		{
			System.out.println("Price is 60");
			return 60;
		}
		if(thickness == 7)
		{
			System.out.println("Price is 70");
			return 70;
		}
		if(thickness == 8)
		{
			System.out.println("Price is 80");
			return 80;
		}
		if(thickness == 9)
		{
			System.out.println("Price is 90");
			return 90;
		}
		if(thickness == 10)
		{
			System.out.println("Price is 100");
			return 100;
		}
		else
		{
			System.out.println("Thickness not found");
		}
		return -1;
	}
}