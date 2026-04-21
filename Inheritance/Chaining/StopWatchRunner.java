class StopWatchRunner {
	
    public static void main(String... args) 
	{

        StopWatch stopWatch1 = new DigitalStopWatch();
        stopWatch1.start(); 
		stopWatch1.stop(); 
		stopWatch1.reset(); 
		stopWatch1.display(); 
		stopWatch1.accuracy();

        StopWatch stopWatch2 = new DigitalStopWatch();
        stopWatch2.start(); 
		stopWatch2.stop(); 
		stopWatch2.reset(); 
		stopWatch2.display(); 
		stopWatch2.accuracy();
    }
}