class LockHolder {

	String holderName;
	int holderAge;
	String city;
	
	LockHolder(String holderName , int holderAge , String city)
	{
		this.holderName = holderName;
		this.holderAge = holderAge;
		this.city = city;
	}
	
	void display()
	{
		System.out.println("Running display in LockHolder");
		System.out.println("Holder Name: "+this.holderName);
		System.out.println("Holder Age: "+this.holderAge);
		System.out.println("City: "+this.city);
	}
	
	public Lock info()
	{
		Lock lock = new Lock("Steel","Key",500);
		return lock;
	}
}