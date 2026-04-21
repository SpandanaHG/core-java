class Hospital {
	
	String name;
	String location;
	String category;
	int noOfBeds;
	double consultationFee;
	
	Hospital(String name , String location)
	{
		this.name = name;
		this.location = location;
	}
	
	Hospital(String name , String location , String category)
	{
		this.name = name;
		this.location = location;
		this.category = category;
	}
	
	Hospital(String name , String location , String category , int noOfBeds , double consultationFee)
	{
		this.name = name;
		this.location = location;
		this.category = category;
		this.noOfBeds = noOfBeds;
		this.consultationFee = consultationFee;
	}
	
}