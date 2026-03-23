class Lipstick {
	public static void main(String[] values)
	{
		String brand1 = "Colorbar";
		String brand2 = "Mamaearth";
		String brand3 = "Maybelline";
		String brand4 = "Lakme";
		String brand5 = "Huda Beauty";
		String brand6 = "LoveChild Masaba";
		String brand7 = "Faces Canada";
		String[] brands = {brand1 , brand2 , brand3 , brand4 , brand5 , brand6 , brand7 , "MAC" , "Revlon" , "Swiss Beauty" };
		
		brands[8] = null;
		brands[7] = "Colorbar";
		System.out.println("Total lipstick brands : "+brands.length);
		
		for(int brand=9 ; brand >=0 ; brand--)
		{
			System.out.println("Brand at position "+brand+ " is :"+brands[brand]);
		}	
		System.out.println(brands[10]);
	}
}