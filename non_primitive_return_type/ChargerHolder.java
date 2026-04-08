class ChargerHolder {

	String holderName;
	int holderAge;
	String city;
	
	ChargerHolder(String holderName , int holderAge , String city)
	{
		this.holderName = holderName;
		this.holderAge = holderAge;
		this.city = city;
	}
	
	void display()
	{
		System.out.println("Running display in ChargerHolder");
		System.out.println("Holder Name: "+this.holderName);
		System.out.println("Holder Age: "+this.holderAge);
		System.out.println("City: "+this.city);
	}
	
	public Charger info()
	{
		Charger charger = new Charger("Samsung","Fast",25);
		return charger;
	}
}