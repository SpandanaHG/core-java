class MickeyMouseRunner {
	
	public static void main(String[] values)
	{
		MickeyMouse mickey = new MickeyMouse();
		MickeyMouseRun mickeyRun = new MickeyMouseRun();
		
		mickeyRun.info(mickey);
		
		mickey.color = "Red & Black";
		mickey.type = "Disney";
		mickey.age = 95;
		mickey.dress = "Blue";
		mickey.isFamous = false;
		
		mickeyRun.info(mickey);
	}
}