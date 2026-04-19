class District {
	
	String name;
	Collector collector;
	
	District(String name , Collector collector)
	{
		this.name = name;
		this.collector = collector;
	}
	
	void displayDistrict()
	{
		System.out.println("Running displayDistrict in District");
		System.out.println("District name : "+this.name);
		if(this.collector != null)
		{
			this.collector.displayCollector();
		}
		else
		{
			System.out.println("Collector is null");
		}
		
	}
}