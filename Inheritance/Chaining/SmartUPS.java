class SmartUPS extends UPS {

    @Override
    void battery() 
	{
		System.out.println("High capacity battery"); 
	}

    @Override
    void capacity() 
	{
		System.out.println("More backup time"); 
	}

    @Override
    void safety() 
	{
		System.out.println("Advanced safety features"); 
	}
}