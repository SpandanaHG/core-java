class Rotater {
	
	String type = "Fidget";
    String color = "Black";
    int speed = 5;
    String material = "Plastic";
    boolean isSmooth = true;
	
	void display()
	{
		System.out.println("Running display in the Rotater");
		System.out.println("Type: " + this.type);
		System.out.println("Color: " + this.color);
		System.out.println("Speed: " + this.speed);
		System.out.println("Material: " + this.material);
		System.out.println("Is Smooth: " + this.isSmooth);
	}
}