class JewelryRunner{
	
	public static void main(String... values)
	{
		Jewelry jewelry = new Jewelry("Tanishq" , "Ring" , "City Mall");
		jewelry.display();
		
		Diamond diamond = jewelry.getDiamond();
		diamond.display();
	}
}