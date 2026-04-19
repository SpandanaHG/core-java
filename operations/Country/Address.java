class Address {
	
	int no; 
	int pincode;
	State state;
	
	Address(int no , int pincode , State state)
	{
		this.no = no;
		this.pincode = pincode;
		this.state = state;
	}
	
	void displayAddress()
	{
		System.out.println("Running displayAddress in Address");
		System.out.println("Number : "+this.no);
		System.out.println("Pincode : "+this.pincode);
		
		if(this.state != null)
		{
			this.state.displayState();
		}
		else
		{
			System.out.println("State is null");
		}
		
	}
}