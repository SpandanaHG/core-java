class IPodRunner {
	
    public static void main(String... args) 
	{

        IPod iPod1 = new TouchIPod();
        iPod1.storage(); 
		iPod1.battery(); 
		iPod1.usage(); 
		iPod1.display(); 
		iPod1.buttons();

        IPod iPod2 = new TouchIPod();
        iPod2.storage(); 
		iPod2.battery(); 
		iPod2.usage(); 
		iPod2.display(); 
		iPod2.buttons();
    }
}