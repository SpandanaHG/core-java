class PandaRunner {
	
	public static void main(String[] values)
	{
		Panda panda = new Panda();
		PandaRun pandaRun = new PandaRun();
		
		pandaRun.info(panda);
		
		panda.color = "White";
		panda.type = "Wild Animal";
		panda.age = 7;
		panda.food = "Fruits";
		panda.isCute = false;
		
		pandaRun.info(panda);
	}
}