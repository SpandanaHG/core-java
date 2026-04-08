class DesertRunner{
	
	public static void main(String... values)
	{
		Desert desert = new Desert("Thar" , "India" , 45);
		desert.display();
		
		Sand sand = desert.getSand();
		sand.display();
	}
}