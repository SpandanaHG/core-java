class Keychain {
	
	String material = "Metal";
    String color = "Silver";
    String shape = "Round";
    int price = 50;
    boolean hasLight = false;
	
	void display()
	{
		System.out.println("Running display in the Keychain");
		System.out.println("Material: " + this.material);
		System.out.println("Color: " + this.color);
		System.out.println("Shape: " + this.shape);
		System.out.println("Price: " + this.price);
		System.out.println("Has Light: " + this.hasLight);
	}
}