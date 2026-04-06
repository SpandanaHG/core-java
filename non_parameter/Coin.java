class Coin{
	
	int rupee = 5;
	String material = "Steel";
	
	void display()
	{
		System.out.println("Running display in Coin");
		System.out.println("Rupee: "+this.rupee);
		System.out.println("Material: "+this.material);
	}
}