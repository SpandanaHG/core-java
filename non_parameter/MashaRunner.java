class MashaRunner {
	
	public static void main(String[] values)
	{
		Masha masha = new Masha();
		MashaRun mashaRun = new MashaRun();
		
		mashaRun.info(masha);
		
		masha.dress = "Yellow";
		masha.type = "Animated";
		masha.age = 7;
		masha.friend = "Rabbit";
		masha.isCute = false;
		
		mashaRun.info(masha);
	}
}