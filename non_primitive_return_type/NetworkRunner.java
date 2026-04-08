class NetworkRunner{
	
	public static void main(String... values)
	{
		Network network = new Network("Jio" , 50 , "5G");
		network.display();
		
		Tower tower = network.getTower();
		tower.display();
	}
}