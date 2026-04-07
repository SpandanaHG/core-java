class ComputerRunner{
	
	public static void main(String... args)
	{
		Monitor monitor = new Monitor();
		monitor.screenSize = 21;
		monitor.resolution = Resolution.HD;
		
		Computer computer = new Computer("Dell" , 32);
		computer.processor = "i5";
		computer.monitor = monitor;
		
		computer.info();
		
		System.out.println("\n--------------------\n");
		
		Monitor monitor1 = new Monitor();
		monitor1.screenSize = 19;
		monitor1.resolution = Resolution.FULL_HD;
		
		Computer computer1 = new Computer("HP", 16);
		computer1.processor = "i7";
		computer1.monitor = monitor;
		
		computer1.info();
	}
}