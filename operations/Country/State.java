class State {
	
	String name;
	int population;
	City city;
	
	State(String name , int population , City city)
	{
		this.name = name;
		this.population = population;
		this.city = city;
	}
	
	void displayState()
	{
		System.out.println("Running displayState in State");
		System.out.println("State name : "+this.name);
		System.out.println("Population : "+this.population);
		
		if(this.city != null)
		{
			this.city.displayCity();
		}
		else
		{
			System.out.println("City is null");
		}
		
	}
}