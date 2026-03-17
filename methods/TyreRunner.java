class TyreRunner
{
	public static void main(String[] args)
	{
		double price = Tyre.getPrice("MRF" , 15);
		System.out.println("Price : "+price);
		
		double price2 = Tyre.getPrice("MRF" , 16);
		System.out.println("Price : "+price2);
		
		double price3 = Tyre.getPrice("MRF" , 17);
		System.out.println("Price : "+price3);
		
		double price4 = Tyre.getPrice("CEAT" , 15);
		System.out.println("Price : "+price4);
		
		double price5 = Tyre.getPrice("CEAT" , 16);
		System.out.println("Price : "+price5);
		
		double price6 = Tyre.getPrice("CEAT" , 17);
		System.out.println("Price : "+price6);
		
		double price7 = Tyre.getPrice("Apollo" , 15);
		System.out.println("Price : "+price7);
		
		double price8 = Tyre.getPrice("Apollo" , 16);
		System.out.println("Price : "+price8);
		
		double price9 = Tyre.getPrice("Apollo" , 17);
		System.out.println("Price : "+price9);
		
		double price10 = Tyre.getPrice("JK" , 15);
		System.out.println("Price : "+price10);
		
		double price11 =Tyre.getPrice("JK" , 16);
		System.out.println("Price : "+price11);
		
		double price12 =Tyre.getPrice("JK" , 17);
		System.out.println("Price : "+price12);
		
		double price13 =Tyre.getPrice("JK" , 20);
		System.out.println("Price : "+price13);
	}
}