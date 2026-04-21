class MicRunner {
	
    public static void main(String... args) 
	{

        Mic mic1 = new WirelessMic();
        mic1.sound(); 
		mic1.type(); 
		mic1.usage(); 
		mic1.power(); 
		mic1.range();

        Mic mic2 = new WirelessMic();
        mic2.sound(); 
		mic2.type(); 
		mic2.usage(); 
		mic2.power(); 
		mic2.range();
    }
}