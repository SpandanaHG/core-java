class Water {
	
	String type = "Mineral";
    String color = "Clear";
    int quantity = 1;
    String state = "Liquid";
    boolean isDrinkable = true;
	
	void display()
	{
		System.out.println("Running display in the Water");
		System.out.println("Type: " + this.type);
		System.out.println("Color: " + this.color);
		System.out.println("Quantity: " + this.quantity);
		System.out.println("State: " + this.state);
		System.out.println("Is Drinkable: " + this.isDrinkable);
	}
}