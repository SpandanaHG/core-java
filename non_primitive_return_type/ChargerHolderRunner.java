class ChargerHolderRunner{
	
	public static void main(String... values)
	{
		ChargerHolder chargerHolder = new ChargerHolder("Ram" , 34 , "Bangalore");
		chargerHolder.display();
		
		Charger charger = chargerHolder.info();
		charger.display();
	}
}