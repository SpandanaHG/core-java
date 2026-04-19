class Country {
	
	String name;
	President president;
    State[] states;
	
	Country(String name , President president , State[] states)
	{
		this.name = name;
		this.president = president;
		this.states = states;
	}
	
	void displayCountry()
	{
		System.out.println("Running displayCountry in Country");
		System.out.println("Country name : "+this.name);
		
		if(this.president != null)
		{
			this.president.displayPresident();
		}
		else
		{
			System.out.println("President is null");
		}
		
		boolean found = false;

		if(this.states != null)
		{
			for(State state : this.states)
			{
				if(state != null)
				{
					state.displayState();
					found = true;
				}
			}
			if(!found)
			{
				System.out.println("State is null");
			}
		}
		else
		{
			System.out.println("Invalid states");
		}
		
	}
}