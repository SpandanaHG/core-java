class Books {
	int noOfPage;
	String brand;
	
	Books(int noOfPage , String brand)
	{
		this.noOfPage = noOfPage;
		this.brand = brand;
	}
	void display()
	{
		System.out.println("Running display in Books");
		System.out.println("No of pages : "+this.noOfPage);
		System.out.println("Brand : "+this.brand);
	}
}