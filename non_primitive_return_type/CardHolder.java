class CardHolder {

    String holderName;
    int holderAge;
    String city;
	
	CardHolder(String holderName , int holderAge , String city)
	{
		this.holderName = holderName;
		this.holderAge = holderAge;
		this.city = city;
	}
	void display()
	{
		System.out.println("Running display in CardHolder");
		System.out.println("Holder Name: "+this.holderName);
		System.out.println("Holder Age: "+this.holderAge);
		System.out.println("City: "+this.city);
	}
	
	public Card info()
	{
		Card card = new Card("Debit","SBI",1234);
		return card;
	}
}