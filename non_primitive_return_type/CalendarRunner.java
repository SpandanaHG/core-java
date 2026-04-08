class CalendarRunner{
	
	public static void main(String... values)
	{
		Calendar calendar = new Calendar("April" , 30 , "2026");
		calendar.display();
		
		Day day = calendar.getDay();
		day.display();
	}
}
