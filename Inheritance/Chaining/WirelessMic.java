class WirelessMic extends Mic {

    @Override
    void type() 
	{
		System.out.println("WirelessMic has no wires"); 
	}

    @Override
    void power() 
	{
		System.out.println("Uses battery"); 
	}

    @Override
    void range() 
	{
		System.out.println("Long range mic"); 
	}
}