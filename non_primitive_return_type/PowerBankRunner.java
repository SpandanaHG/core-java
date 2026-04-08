class PowerBankRunner{
	
	public static void main(String... values)
	{
		PowerBank powerBank = new PowerBank("PB101" , 20000 , "Black");
		powerBank.display();
		
		Charger charger = powerBank.getCharger();
		charger.display();
	}
}