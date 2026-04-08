class Card{
	
	String type;
    String bank;
    int number; 
	
	Card(String type , String bank , int number)
	{
		this.type = type;
		this.bank = bank;
		this.number = number;
	}
	
	void display()
	{
		System.out.println("Running dispaly in Card");
		System.out.println("Type: "+this.type);
		System.out.println("Bank: "+this.bank);
		System.out.println("Number: "+this.number);
	}
}