class Tyre
{
	static double getPrice(String brand, int size)
	{
		System.out.println("Executing getPrice with args : "+brand+" "+size);
		if("MRF"==brand && size==15)
		{
			System.out.println("Price is 1000");
			return 1000;
		}
		if("MRF"==brand && size==16)
		{
			System.out.println("Price is 1100");
			return 1100;
		}
		if("MRF"==brand && size==17)
		{
			System.out.println("Price is 1200");
			return 1200;
		}

		if("CEAT"==brand && size==15)
		{
			System.out.println("Price is 1050");
			return 1050;
		}
		if("CEAT"==brand && size==16)
		{
			System.out.println("Price is 1150");
			return 1150;
		}
		if("CEAT"==brand && size==17)
		{
			System.out.println("Price is 1250");
			return 1250;
		}
		if("Apollo"==brand && size==15)
		{
			System.out.println("Price is 1020");
			return 1020;
		}
		if("Apollo"==brand && size==16)
		{
			System.out.println("Price is 1120");
			return 1120;
		}
		if("Apollo"==brand && size==17)
		{
			System.out.println("Price is 1220");
			return 1220;
		}

		if("JK"==brand && size==15)
		{
			System.out.println("Price is 1010");
			return 1010;
		}
		if("JK"==brand && size==16)
		{
			System.out.println("Price is 1110");
			return 1110;
		}
		if("JK"==brand && size==17)
		{
			System.out.println("Price is 1210");
			return 1210;
		}
		else
		{
			System.out.println("Tyre not found");
		}
		return -1;
	}
}