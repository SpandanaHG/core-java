class NetRunner {
	
	public static void main(String[] values)
	{
		Net net = new Net();
		NetRun netRun = new NetRun();
		
		netRun.info(net);
		
		net.material = "Cotton";
		net.color = "Green";
		net.length = 15;
		net.type = "Safety";
		net.isStrong = false;
		
		netRun.info(net);
	}
}