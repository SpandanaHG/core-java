class Net {
	
	String material = "Nylon";
    String color = "White";
    int length = 10;
    String type = "Sports";
    boolean isStrong = true;
	
	void display()
	{
		System.out.println("Running display in the Net");
		System.out.println("Material: " + this.material);
		System.out.println("Color: " + this.color);
		System.out.println("Length: " + this.length);
		System.out.println("Type: " + this.type);
		System.out.println("Is Strong: " + this.isStrong);
	}
}