class UPSRunner {
	
    public static void main(String... args) 
	{

        UPS uPS1 = new SmartUPS();
        uPS1.power(); 
		uPS1.battery(); 
		uPS1.usage(); 
		uPS1.capacity(); 
		uPS1.safety();

        UPS uPS2 = new SmartUPS();
        uPS2.power(); 
		uPS2.battery(); 
		uPS2.usage(); 
		uPS2.capacity(); 
		uPS2.safety();
    }
}