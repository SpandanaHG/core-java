class MovieTicket
{
	static double getPriceByMovie(String movie, String seat, String theatre)
	{
		System.out.println("Executing getPriceByMovie in MovieTicket with args : "+movie +seat +theatre);

		if("KGF"==movie && "Gold"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 300"); 
			return 300;
		}
		if("KGF"==movie && "Silver"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 250"); 
			return 250;
		}
		if("KGF"==movie && "Platinum"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 350"); 
			return 350;
		}
		if("RRR"==movie && "Gold"==seat && "INOX"==theatre)
		{
			System.out.println("Price is 320"); 
			return 320;
		}
		if("RRR"==movie && "Silver"==seat && "INOX"==theatre)
		{
			System.out.println("Price is 270"); 
			return 270;
		}
		if("RRR"==movie && "Platinum"==seat && "INOX"==theatre)
		{
			System.out.println("Price is 370"); 
			return 370;
		}
		if("Pushpa"==movie && "Gold"==seat && "Cinepolis"==theatre)
		{
			System.out.println("Price is 310"); 
			return 310;
		}
		if("Pushpa"==movie && "Silver"==seat && "Cinepolis"==theatre)
		{
			System.out.println("Price is 260"); 
			return 260;
		}
		if("Pushpa"==movie && "Platinum"==seat && "Cinepolis"==theatre)
		{
			System.out.println("Price is 360"); 
			return 360;
		}
		if("Leo"==movie && "Gold"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 330"); 
			return 330;
		}
		if("Leo"==movie && "Silver"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 280"); 
			return 280;
		}
		if("Leo"==movie && "Platinum"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 380"); 
			return 380;
		}
		if("Jailer"==movie && "Gold"==seat && "INOX"==theatre)
		{
			System.out.println("Price is 340"); 
			return 340;
		}
		if("Jailer"==movie && "Silver"==seat && "INOX"==theatre)
		{
			System.out.println("Price is 290"); 
			return 290;
		}
		if("Jailer"==movie && "Platinum"==seat && "INOX"==theatre)
		{
			System.out.println("Price is 390"); 
			return 390;
		}
		if("Avatar"==movie && "Gold"==seat && "IMAX"==theatre)
		{
			System.out.println("Price is 400"); 
			return 400;
		}
		if("Avatar"==movie && "Silver"==seat && "IMAX"==theatre)
		{
			System.out.println("Price is 350"); 
			return 350;
		}
		if("Avatar"==movie && "Platinum"==seat && "IMAX"==theatre)
		{
			System.out.println("Price is 450"); 
			return 450;
		}
		if("KGF2"==movie && "Gold"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 310"); 
			return 310;
		}
		if("KGF2"==movie && "Silver"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 260"); 
			return 260;
		}
		if("KGF2"==movie && "Platinum"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 360"); 
			return 360;
		}
		if("Salaar"==movie && "Gold"==seat && "INOX"==theatre)
		{
			System.out.println("Price is 320"); 
			return 320;
		}
		if("Salaar"==movie && "Silver"==seat && "INOX"==theatre)
		{
			System.out.println("Price is 270"); 
			return 270;
		}
		if("Salaar"==movie && "Platinum"==seat && "INOX"==theatre)
		{
			System.out.println("Price is 370"); 
			return 370;
		}
		if("Pathaan"==movie && "Gold"==seat && "Cinepolis"==theatre)
		{
			System.out.println("Price is 330"); 
			return 330;
		}
		if("Pathaan"==movie && "Silver"==seat && "Cinepolis"==theatre)
		{
			System.out.println("Price is 280"); 
			return 280;
		}
		if("Pathaan"==movie && "Platinum"==seat && "Cinepolis"==theatre)
		{
			System.out.println("Price is 380"); 
			return 380;
		}
		if("Dunki"==movie && "Gold"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 340"); 
			return 340;
		}
		if("Dunki"==movie && "Silver"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 290"); 
			return 290;
		}
		if("Dunki"==movie && "Platinum"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 390"); 
			return 390;
		}
		if("Animal"==movie && "Gold"==seat && "INOX"==theatre)
		{
			System.out.println("Price is 350"); 
			return 350;
		}
		if("Animal"==movie && "Silver"==seat && "INOX"==theatre)
		{
			System.out.println("Price is 300"); 
			return 300;
		}
		if("Animal"==movie && "Platinum"==seat && "INOX"==theatre)
		{
			System.out.println("Price is 400"); 
			return 400;
		}
		if("Kantara"==movie && "Gold"==seat && "Cinepolis"==theatre)
		{
			System.out.println("Price is 310"); 
			return 310;
		}
		if("Kantara"==movie && "Silver"==seat && "Cinepolis"==theatre)
		{
			System.out.println("Price is 260"); 
			return 260;
		}
		if("Kantara"==movie && "Platinum"==seat && "Cinepolis"==theatre)
		{
			System.out.println("Price is 360"); 
			return 360;
		}
		if("RRR2"==movie && "Gold"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 330"); 
			return 330;
		}
		if("RRR2"==movie && "Silver"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 280"); 
			return 280;
		}
		if("RRR2"==movie && "Platinum"==seat && "PVR"==theatre)
		{
			System.out.println("Price is 380"); 
			return 380;
		}
		else
		{
			System.out.println("Ticket not found");
		}
		return -1;
	}
}