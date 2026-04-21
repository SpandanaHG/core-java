class MultiSpecialityHospital extends Hospital {
	
	MultiSpecialityHospital(String name , String location)
	{
		super(name , location);
	}
	
	MultiSpecialityHospital(String name , String location , String category)
	{
		super(name , location , category);
	}
	
	MultiSpecialityHospital(String name , String location , String category , int noOfBeds , double consultationFee)
	{
		super(name , location , category , noOfBeds , consultationFee);
	}
}