class AdhesiveTape extends Tape {

    @Override
    void adhesive() 
	{
		System.out.println("AdhesiveTape has strong glue"); 
	}

    @Override
    void usage() 
	{
		System.out.println("Used for packaging"); 
	}

    @Override
    void strength() 
	{
		System.out.println("High strength tape"); 
	}
}
