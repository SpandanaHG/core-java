class Carrom{
	
	String boardMaterial = "Wood";
    int numberOfCoins = 19;
    String strikerType = "Acrylic";
    String boardSize = "Standard";
    boolean hasNet = true;
	
	void display()
	{
		System.out.println("Running display in the Carrom");
		System.out.println("Board Material: "+this.boardMaterial);
		System.out.println("Number of Coins: "+this.numberOfCoins);
		System.out.println("Striker Type: "+this.strikerType);
		System.out.println("Board Size: "+this.boardSize);
		System.out.println("Has net: "+this.hasNet);
	}
}