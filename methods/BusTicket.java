class BusTicket
{
	static double getPriceByPlace(String place)
	{
		System.out.println("Executing getPriceByPlace with args : " + place);
		if("Bangalore"==place)
		{
			System.out.println("Price is 100"); 
			return 100;
		}
		if("Mysore"==place)
		{
			System.out.println("Price is 110"); 
			return 110;
		}
		if("Delhi"==place)
		{
			System.out.println("Price is 120"); 
			return 120;
		}
		if("Mumbai"==place)
		{
			System.out.println("Price is 130"); 
			return 130;
		}
		if("Chennai"==place)
		{
			System.out.println("Price is 140"); 
			return 140;
		}
		if("Hyderabad"==place)
		{
			System.out.println("Price is 150"); 
			return 150;
		}
		if("Pune"==place)
		{
			System.out.println("Price is 160"); 
			return 160;
		}
		if("Goa"==place)
		{
			System.out.println("Price is 170"); 
			return 170;
		}
		if("Jaipur"==place)
		{
			System.out.println("Price is 180"); 
			return 180;
		}
		if("Kolkata"==place)
		{
			System.out.println("Price is 190"); 
			return 190;
		}
		if("Nagpur"==place)
		{
			System.out.println("Price is 200"); 
			return 200;
		}
		if("Indore"==place)
		{
			System.out.println("Price is 210"); 
			return 210;
		}
		if("Bhopal"==place)
		{
			System.out.println("Price is 220"); 
			return 220;
		}
		if("Lucknow"==place)
		{
			System.out.println("Price is 230"); 
			return 230;
		}
		if("Patna"==place)
		{
			System.out.println("Price is 240"); 
			return 240;
		}
		if("Surat"==place)
		{
			System.out.println("Price is 250"); 
			return 250;
		}
		if("Noida"==place)
		{
			System.out.println("Price is 260"); 
			return 260;
		}
		if("Gurgaon"==place)
		{
			System.out.println("Price is 270"); 
			return 270;
		}
		if("Udupi"==place)
		{
			System.out.println("Price is 280"); 
			return 280;
		}
		if("Hubli"==place)
		{
			System.out.println("Price is 290"); 
			return 290;
		}
		if("Belgaum"==place)
		{
			System.out.println("Price is 300"); 
			return 300;
		}
		if("Mangalore"==place)
		{
			System.out.println("Price is 310"); 
			return 310;
		}
		if("Shimoga"==place)
		{
			System.out.println("Price is 320"); 
			return 320;
		}
		if("Trichy"==place)
		{
			System.out.println("Price is 330"); 
			return 330;
		}
		if("Madurai"==place)
		{
			System.out.println("Price is 340"); 
			return 340;
		}
		if("Vizag"==place)
		{
			System.out.println("Price is 350"); 
			return 350;
		}
		if("Warangal"==place)
		{
			System.out.println("Price is 360"); 
			return 360;
		}
		if("Vijayawada"==place)
		{
			System.out.println("Price is 370"); 
			return 370;
		}
		if("Coimbatore"==place)
		{
			System.out.println("Price is 380"); 
			return 380;
		}
		if("Salem"==place)
		{
			System.out.println("Price is 390"); 
			return 390;
		}
		else
		{
			System.out.println("Place not found");
		}
		return -1;
	}
}