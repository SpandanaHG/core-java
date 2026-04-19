class City {
	
	String name;
	int noOfDistrict;
	District[] districts;
	
	City(String name , int noOfDistrict , District[] districts)
	{
		this.name = name;
		this.noOfDistrict = noOfDistrict;
		this.districts = districts;
	}
	
	void displayCity()
	{
		System.out.println("Running displayCity in City");
		System.out.println("City name : "+this.name);
		System.out.println("Number of District");
		
		boolean found = false;
		if(this.districts != null)
		{
			for(District district : this.districts)
			{
				if(district != null)
				{
					district.displayDistrict();
					found = true;
				}
			}
			if(!found)
			{
				System.out.println("District is null");
			}
		}
		else
		{
			System.out.println("Districts is invalid");
		}
		
	}
}