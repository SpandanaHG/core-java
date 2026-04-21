class TouchIPod extends IPod {

    @Override
    void display() 
	{
		System.out.println("Touch screen display"); 
	}

    @Override
    void buttons() 
	{
		System.out.println("Minimal buttons"); 
	}

    @Override
    void battery() 
	{
		System.out.println("Long battery life"); 
	}
}
