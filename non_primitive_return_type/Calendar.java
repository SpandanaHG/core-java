class Calendar {

	String month;
	int totalDays;
	String year;
	
	Calendar(String month , int totalDays , String year)
	{
		this.month = month;
		this.totalDays = totalDays;
		this.year = year;
	}
	
	void display()
	{
		System.out.println("Running display in Calendar");
		System.out.println("Month: "+this.month);
		System.out.println("Total Days: "+this.totalDays);
		System.out.println("Year: "+this.year);
	}
	
	public Day getDay()
	{
		Day day = new Day("Monday" , 1 , false);
		return day;
	}
}