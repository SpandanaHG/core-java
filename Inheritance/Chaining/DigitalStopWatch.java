class DigitalStopWatch extends StopWatch {

    @Override
    void display() 
	{
		System.out.println("Digital display"); 
	}

    @Override
    void accuracy() 
	{
		System.out.println("High accuracy"); 
	}

    @Override
    void reset() 
	{
		System.out.println("Quick reset"); 
	}
}
